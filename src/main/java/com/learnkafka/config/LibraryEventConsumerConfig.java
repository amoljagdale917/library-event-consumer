package com.learnkafka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
//if you want to used spring auto configuration and read the properties 
//from yml then we have used @EnableKafka
@EnableKafka
public class LibraryEventConsumerConfig {

}
