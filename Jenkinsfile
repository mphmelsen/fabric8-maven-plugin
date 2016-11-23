#!/usr/bin/env groovy +x

node('jdk8') {

   // name of this project
   microservice = 'mjop-elements'

   // evnironment name in ose to deploy instance to
   osEnvironment = 'development'

   // define commands
   def mvnHome = tool 'M3'
   def mvnCmd = "${mvnHome}/bin/mvn -s ${env.JENKINS_HOME}/settings.xml -Popenshift"
   def ocCmd = "/usr/bin/oc --token=`cat /var/run/secrets/kubernetes.io/serviceaccount/token` --server=https://openshift.default.svc.cluster.local --certificate-authority=/run/secrets/kubernetes.io/serviceaccount/ca.crt"


   stage 'Build code'

     git url: 'http://bitbucket.openshift.itris.lan/scm/vptx/' + microservice + '.git'

     def v = version()
     sh "${mvnCmd} clean compile"

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

   stage 'Push buildartifact to Nexus'

     sh "${mvnCmd} deploy -DskipTests=true"

   stage 'Create image and deploymentconfig'

     sh "${mvnCmd} install"

   stage 'Deploy DEV'

     echo 'Starting deployment of ${microservice} to ${osEnvironment} ...'

     sh "${mvnCmd} deploy -Dfabric8.namespace=${osEnvironment}"

     // tag for staging
     sh "${ocCmd} tag ${osEnvironment}/${microservice}:${v} ${osEnvironment}/${microservice}:latest"
     sh "${ocCmd} tag ${osEnvironment}/${microservice}:latest staging/${microservice}:${v}"
     //sh "${ocCmd} tag ${osEnvironment}/${microservice}:latest staging/${microservice}:latest"

}

def version() {
  def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
  matcher ? matcher[0][1] : null
}

