package com.alvaro.KafkaConsumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private Logger logger = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"topic1", "topic2"}, groupId = "grupo1")
    public void listener(String message) {
        logger.info("Mensaje recibido de Kafka: " + message);
    }
}