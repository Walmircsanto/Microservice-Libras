
#Versão do jdk da sua aplicação
FROM openjdk:17-jdk-alpine

# Copie o JAR da sua aplicação para o container
COPY target/microservice-0.0.1-SNAPSHOT.jar app.jar

#Expor a porta da aplicação
EXPOSE 8080

#Comando para rodar a aplicação
ENTRYPOINT ["java","-jar","/app.jar"]