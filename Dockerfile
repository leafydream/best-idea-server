FROM java:8

MAINTAINER leafych@126.com

VOLUME /tmp

ADD ./target/best-idea-server-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=prod"]