FROM java:8

MAINTAINER Michael Staehler <hamsterhase@gmx.de>

RUN echo 'Building docker image for demo application...'

VOLUME /tmp

COPY target/bewerter-0.0.1-SNAPSHOT.jar bewerter.jar

RUN bash -c 'touch /bewerter.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/bewerter.jar"]