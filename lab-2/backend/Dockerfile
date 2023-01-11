FROM eclipse-temurin:17-jre-alpine

WORKDIR /opt/app

COPY app/build/libs/*.jar /opt/app/app.jar

ENTRYPOINT ["java","-jar","/opt/app/app.jar"]

EXPOSE 80