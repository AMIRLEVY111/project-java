FROM openjdk:latest

WORKDIR /app

COPY code.java /app

CMD ["java", "./code.java"]