<?xml version='1.0' encoding='UTF-8'?>
<hudson>
  <disabledAdministrativeMonitors/>
  <version>1.642.2</version>
  <numExecutors>5</numExecutors>
  <mode>NORMAL</mode>
  <useSecurity>true</useSecurity>
  <authorizationStrategy class="hudson.security.FullControlOnceLoggedInAuthorizationStrategy"/>
  <securityRealm class="org.jenkinsci.plugins.oic.OicSecurityRealm" plugin="oic-auth@1.0">
    <clientId>jenkins</clientId>
    <clientSecret>14d0c53f-3ced-42b5-9664-b59a8a0c4292</clientSecret>
    <tokenServerUrl>http://sso-default.openshift.itris.lan/auth/realms/openshift/protocol/openid-connect/token</tokenServerUrl>
    <authorizationServerUrl>http://sso-default.openshift.itris.lan/auth/realms/openshift/protocol/openid-connect/auth</authorizationServerUrl>
    <userNameField>sub</userNameField>
    <scopes>openid email</scopes>
  </securityRealm>
  <disableRememberMe>false</disableRememberMe>
  <projectNamingStrategy class="jenkins.model.ProjectNamingStrategy$DefaultProjectNamingStrategy"/>
  <workspaceDir>${ITEM_ROOTDIR}/workspace</workspaceDir>
  <buildsDir>${ITEM_ROOTDIR}/builds</buildsDir>
  <markupFormatter class="hudson.markup.RawHtmlMarkupFormatter" plugin="antisamy-markup-formatter@1.1">
    <disableSyntaxHighlighting>false</disableSyntaxHighlighting>
  </markupFormatter>
  <jdks>
    <jdk>
      <name>JDK-8</name>
      <home>/usr/lib/jvm/java-1.8.0</home>
      <properties/>
    </jdk>
  </jdks>
  <viewsTabBar class="hudson.views.DefaultViewsTabBar"/>
  <myViewsTabBar class="hudson.views.DefaultMyViewsTabBar"/>
  <clouds>
    ${KUBERNETES_CONFIG}
  </clouds>
    <quietPeriod>1</quietPeriod>
    <scmCheckoutRetryCount>0</scmCheckoutRetryCount>
    <views>
      <hudson.model.AllView>
        <owner class="hudson" reference="../../.."/>
        <name>All</name>
        <filterExecutors>false</filterExecutors>
        <filterQueue>false</filterQueue>
        <properties/>
      </hudson.model.AllView>
    </views>
    <primaryView>All</primaryView>
    <slaveAgentPort>50000</slaveAgentPort>
    <label>master</label>
    <nodeProperties/>
    <globalNodeProperties/>
    <noUsageStatistics>true</noUsageStatistics>
  </hudson>