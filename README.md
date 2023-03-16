# zio-http-sample
Trying out zio-http library for developing webservices.

# Compile the code
`mvn clean package -DskipTests`

# Running the server locally
## Run server from the docker folder
From repo root folder, run `java -jar docker/zio-http-sample-1.0-SNAPSHOT.jar`

## Run server from the compiled code
From repo root folder, run `java -jar target/zio-http-sample-1.0-SNAPSHOT.jar`

## Test the server
From another terminal, run `curl -i "http://localhost:8080/text"`

## Exit the server
Press CTRL+C on the server terminal.

# Building and running from docker
## Docker setup
Navigate to `zio-http-sample\docker` folder. Then execute the following commands:
```
sudo docker build -t "zio-http:v1" .
```
