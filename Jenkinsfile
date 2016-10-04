#!/usr/bin/env groovy +x

node('jdk8') {


   def microservice = 'mjop-elements'

   // define commands
   def mvnHome = tool 'M3'
   def mvnCmd = "${mvnHome}/bin/mvn -s ${env.JENKINS_HOME}/settings.xml"
   def ocCmd = "/usr/bin/oc --token=`cat /var/run/secrets/kubernetes.io/serviceaccount/token` --server=https://openshift.default.svc.cluster.local --certificate-authority=/run/secrets/kubernetes.io/serviceaccount/ca.crt"


   stage 'Build'

     git url: 'http://gogs.openshift.itris.lan/itris/${microservice}.git'
     def v = version()
     sh "${mvnCmd} clean install -DskipTests=true"

   stage 'Test and Analysis'
     parallel (
       'Test': {
           sh "${mvnCmd} test"
           step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
       },
       'Static Analysis': {
           sh "${mvnCmd} jacoco:report sonar:sonar -Dsonar.host.url=http://sonarqube:9000 -DskipTests=true"
       }
     )

   stage 'Push to Nexus'
     sh "${mvnCmd} deploy -DskipTests=true"

   stage 'Deploy DEV'

     sh "rm -rf oc-build && mkdir -p oc-build/deployments"

     sh "cp target/*.war oc-build/deployments/ROOT.war"

     // clean up. keep the image stream
     sh "${ocCmd} delete bc,dc,svc,route -l app=${microservice} -n ${microservice}"

     // delete any left over projects with the same name from previous attempts
     sh "${ocCmd} delete project ${microservice}"

     // create build. override the exit code since it complains about exising imagestream
     sh "${ocCmd} new-build --name=${microservice} --image-stream=jboss-eap64-openshift --binary=true --labels=app=${microservice} -n dev || true"

     // build image
     sh "${ocCmd} start-build ${microservice} --from-dir=oc-build --wait=true -n ${microservice}"

     // create openshift project
     echo "creating openshift project next in order to host the container"
     sh "${ocCmd} new-project ${microservice} --display-name='Temporary development project used to host ${microservice}'"

     // deploy image
     sh "${ocCmd} new-app ${microservice}:latest -n dev"

     sh "${ocCmd} expose svc/${microservice} -n dev"

     // tag for stage
     sh "${ocCmd} tag dev/${microservice}:latest stage/${microservice}:${v}"

}

def version() {
  def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
  matcher ? matcher[0][1] : null
}

