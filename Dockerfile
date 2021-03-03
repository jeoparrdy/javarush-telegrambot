FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=javarushC_bot
ENV BOT_TOKEN=1640336534:AAH3jI7Oq3wAn5Xcq3bwvNDEmXeCNOlewgg
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]