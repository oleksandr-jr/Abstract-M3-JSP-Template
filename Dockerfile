# Використовуємо Maven для збірки проекту
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean install

# Використовуємо Tomcat для запуску веб-додатку
FROM tomcat:10-jdk17-openjdk-buster
WORKDIR /usr/local/tomcat/webapps/
COPY --from=build /app/target/M3-Final-project-quest-1.0.war ./ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "jpda", "run"]