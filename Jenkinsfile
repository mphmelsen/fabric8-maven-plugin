#!/usr/bin/env groovy +x

node('jdk8') {

   // name of this project
   microservice = 'mjop-elements'

   // evnironment name in ose to deploy instance to
   osEnvironment = 'development'

   // define commands
   def mvnHome = tool 'M3'
   def mvnCmd = "${mvnHome}/bin/mvn -s ${env.JENKINS_HOME}/settings.xml"
   def ocCmd = "/usr/bin/oc --token=`cat /var/run/secrets/kubernetes.io/serviceaccount/token` --server=https://openshift.default.svc.cluster.local --certificate-authority=/run/secrets/kubernetes.io/serviceaccount/ca.crt"


   stage 'Build'

     git url: 'http://gogs.openshift.itris.lan/itris/' + microservice + '.git'
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

   stage 'Deploy Development'

     sh "rm -rf oc-build && mkdir -p oc-build/deployments"

     // rename war to ROOT as OpenShift expects this
     sh "cp target/*.war oc-build/deployments/ROOT.war"

     // clean up. keep the image stream
     sh "${ocCmd} delete bc,dc,svc,route -l app=${microservice} -n ${osEnvironment}"

     // create build. override the exit code since it complains about exising imagestream
//     sh "${ocCmd} new-build --name=${microservice} --image-stream=jboss-eap64-openshift --binary=true --labels=app=${microservice} -n ${osEnvironment} || true"

     // cat the dockerfile and add it through stdin to the new-build
     sh "cat docker/Dockerfile | ${ocCmd} new-build --labels=app=${microservice} -n ${osEnvironment} --name=${microservice} -D - || true"

     // build image
     sh "${ocCmd} start-build ${microservice} --from-dir=oc-build --wait=true -n ${osEnvironment}"

     // deploy image
     sh "${ocCmd} new-app ${microservice}:latest -n ${osEnvironment}"

     sh "${ocCmd} expose svc/${microservice} -n ${osEnvironment}"

     // tag for staging
     sh "${ocCmd} tag ${osEnvironment}/${microservice}:latest staging/${microservice}:${v}"
     sh "${ocCmd} tag ${osEnvironment}/${microservice}:latest staging/${microservice}:latest"

}

def version() {
  def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
  matcher ? matcher[0][1] : null
}

