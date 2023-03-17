FROM debian:bullseye-slim

RUN apt-get update && \
    apt-get install -y openjdk-11-jdk && \
    apt-get clean;
    
# Fix certificate issues
RUN apt-get update && \
    apt-get install ca-certificates-java && \
    apt-get clean && \
    update-ca-certificates -f;

# Setup JAVA_HOME -- useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64/
RUN export JAVA_HOME

# Copy the executable jar
COPY zio-http-sample-1.0-SNAPSHOT.jar /root/zio-http-sample-1.0-SNAPSHOT.jar

# Port
EXPOSE 8080

# Run the server
#RUN java -jar /root/zio-http-sample-1.0-SNAPSHOT.jar


CMD ["/usr/bin/java", "-jar", "/root/zio-http-sample-1.0-SNAPSHOT.jar"]



