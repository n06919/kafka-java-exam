# kafka

### Build ###
```
./gradlew build
```

### Run ###
```
# producer
./gradlew bootRun --args='--spring.profiles.active=producer --server.port=8080'

# consumer
./gradlew bootRun --args='--spring.profiles.active=consumer --server.port=8081'

```

### Test ###
```
# send message
curl http://localhost:8080/send?message=hello_kafka

# producer
Sent message: hello_kafka

# consumer
Received message: hello_kafka
```