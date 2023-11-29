FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .

RUN ls -al

RUN mvn clean install


FROM tomcat:9.0.83-jdk17-temurin-jammy
WORKDIR /usr/local/tomcat/webapps/
COPY --from=build /app/target/M3-Final-project-quest-1.0.war ./ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "jpda", "run"]