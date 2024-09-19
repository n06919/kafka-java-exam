# kafka

### Build ###
```
./gradlew build
```

### Run ###
```
./gradlew bootRun
```

### Test ###
```
# send message
curl http://localhost:8080/send?message=hello_kafka

# receive message

2024-09-19T14:44:48.901+09:00  INFO 15385 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-test-group-1, groupId=test-group] Node -1 disconnected.
Sent message: hello_kafka
Received message: hello_kafka
```