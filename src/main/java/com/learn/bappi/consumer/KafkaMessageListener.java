package com.learn.bappi.consumer;

import com.learn.bappi.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "kafka-topic1",groupId = "consumer-group-id")
    public void consume1(String message) {
        log.info("Consumed message 1: {}", message);

    }

    @KafkaListener(topics = "kafka-topic2",groupId = "consumer-group-2")
    public void consumeEvents(Customer customer) {
        log.info("Consumed message 2: {}", customer.toString());

    }

   /* @KafkaListener(topics = "kafka-topic1",groupId = "consumer-group-id")
    public void consume2(String message) {
        log.info("Consumed message 2: {}", message);

    }

    @KafkaListener(topics = "kafka-topic1",groupId = "consumer-group-id")
    public void consume3(String message) {
        log.info("Consumed message 3: {}", message);

    }*/

}
