FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
EXPOSE 8095
ARG JAR_FILE=target/m9.jar
ADD ${JAR_FILE} news.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar news.jar" ]