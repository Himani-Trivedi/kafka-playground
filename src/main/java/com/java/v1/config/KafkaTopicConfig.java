package com.java.v1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic topicOne() {
        return TopicBuilder.name("topic-one")
                .partitions(1)
                .replicas(2)
                .build();
    }

    @Bean
    public NewTopic topicFive() {
        return TopicBuilder.name("topic-five")
                .partitions(1)
                .replicas(2)
                .build();
    }

    @Bean
    public NewTopic topicTen() {
        return TopicBuilder.name("topic-ten")
                .partitions(1)
                .replicas(2)
                .build();
    }
}
