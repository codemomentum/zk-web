FROM tomcat:8.0.20-jre8
RUN rm -fr /usr/local/tomcat/webapps/ROOT
COPY target/zk-web-0.1.0-SNAPSHOT-standalone.war /usr/local/tomcat/webapps/ROOT.war
