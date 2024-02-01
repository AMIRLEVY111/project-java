FROM openjdk:latest

WORKDIR /app

COPY code.py /app

CMD ["java", "./code.java"]