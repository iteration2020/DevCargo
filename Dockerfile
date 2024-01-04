FROM openjdk:21-jdk
ADD build/libs/DevCargo.jar DevCargo.jar
ENTRYPOINT ["java", "-jar","DevCargo.jar"]