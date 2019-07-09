package com.stackroute.kafka.domain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;


public class Producer {
    @Value("${kafka.topic.json}")
    private String jsonTopic;

    @Value("${kafka.topic.json1}")
    private String jsonTopic1;

    private static final Logger LOGGER =
            LoggerFactory.getLogger(Producer.class);

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void send(User user) {
        LOGGER.info("sending data of user='{}'", user.toString());
        kafkaTemplate.send(jsonTopic, user);
    }

    @Autowired
    private KafkaTemplate<String, Space> kafkaTemplate1;


    public void send1(Space space) {
        LOGGER.info("sending data of Space='{}'", space.toString());
        kafkaTemplate1.send(jsonTopic1, space);
    }

}
