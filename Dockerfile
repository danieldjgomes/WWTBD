# Execução para aplicação Java
# Etapa de construção
FROM maven:3.9-eclipse-temurin-19 as java-build
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ADD . /usr/src/app
ENV OPENAI_API_KEY ${OPENAI_API_KEY}
RUN mvn clean package

# Etapa de execução
FROM openjdk:19-jdk-alpine
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY --from=java-build /usr/src/app/target/*.jar /usr/src/app/app.jar
ENV OPENAI_API_KEY ${OPENAI_API_KEY}
CMD ["java", "-jar", "app.jar"]


