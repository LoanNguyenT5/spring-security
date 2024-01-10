FROM tomcat:8.5-jre8-alpine

WORKDIR /usr/local/tomcat/webapps/

COPY target/spring-security-1.0-SNAPSHOT.war .

EXPOSE 8888
