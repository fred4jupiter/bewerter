FROM java:8

COPY target/bewerter-0.0.1-SNAPSHOT.jar bewerter.jar

ENV spring.profiles.active dev

EXPOSE 8080

ENTRYPOINT ["java","-jar","/bewerter.jar"]