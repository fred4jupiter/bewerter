FROM java:8

COPY target/bewerter-0.0.1-SNAPSHOT.jar bewerter.jar

ENTRYPOINT ["java","-jar","/bewerter.jar"]