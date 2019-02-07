FROM openjdk:latest
RUN mkdir -p /usr/local/Licenses
WORKDIR /usr/local/Licenses

ARG JAR_FILE=foo
ADD target/${JAR_FILE} /usr/local/Licenses/service.jar

EXPOSE 8080
ADD src/main/docker/run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
