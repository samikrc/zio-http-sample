FROM debian:buster-slim
RUN apt-get install -y openjdk-11-jdk
ENV JAVA_HOME=/etc/alternatives/jre

# Copy the executable jar
COPY zio-http-sample-1.0-SNAPSHOT.jar /root/zio-http-sample-1.0-SNAPSHOT.jar

# Port
EXPOSE 8080

# Run the server
RUN java -jar zio-http-sample-1.0-SNAPSHOT.jar
