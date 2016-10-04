#!/usr/bin/env groovy

node('jdk8') {
   // define commands
   def mvnHome = tool 'M3'
   def mvnCmd = "${mvnHome}/bin/mvn -s ${env.JENKINS_HOME}/settings.xml"
   def ocCmd = "/usr/bin/oc --token=`cat /var/run/secrets/kubernetes.io/serviceaccount/token` --server=https://openshift.default.svc.cluster.local --certificate-authority=/run/secrets/kubernetes.io/serviceaccount/ca.crt"


   stage 'Build'

   git url: 'http://gogs.openshift.itris.lan/itris/mjop-elements.git'


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
   //sh "cp target/*.war oc-build/deployments/ROOT.war"
   ["sh", "-c", "find . -name '*.war' -print0 | xargs -0 cp -t oc-build/deployments/"].execute()
   // clean up. keep the image stream
   sh "${ocCmd} delete bc,dc,svc,route -l app=tasks -n dev"
   // create build. override the exit code since it complains about exising imagestream
   sh "${ocCmd} new-build --name=tasks --image-stream=jboss-eap64-openshift --binary=true --labels=app=tasks -n dev || true"
   // build image
   sh "${ocCmd} start-build tasks --from-dir=oc-build --wait=true -n dev"
   // deploy image
   sh "${ocCmd} new-app tasks:latest -n dev"
   sh "${ocCmd} expose svc/tasks -n dev"
   // tag for stage
   sh "${ocCmd} tag dev/tasks:latest stage/tasks:${v}"

}

def version() {
  def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
  matcher ? matcher[0][1] : null
}

