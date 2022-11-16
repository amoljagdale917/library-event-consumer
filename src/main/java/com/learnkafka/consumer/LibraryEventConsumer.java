package com.learnkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class LibraryEventConsumer {	
		

	
	  @KafkaListener(topics = {"library-events"} )
	  public void onMessage(ConsumerRecord<Integer, String> consumerRecord){
		  log.info("Consumer Records {}", consumerRecord);
	  
	  }
	 
	 
	/*
	 * @KafkaListener(topics = {"library-events"} ) public void onMessage(String
	 * consumerRecord){ log.info("Consumer Records {}", consumerRecord);
	 * 
	 * }
	 */
	
	/*
	 * 
	public static void main(String[] args) {
		Properties properties  = new Properties();
		properties.put("bootstrap.servers", "localhost:9092,localhost:9093, localhost:9094");
		properties.put("group.id", "library-events-listner-group");
		properties.put("key.deserializer",
		    "org.apache.kafka.common.serialization.IntegerDeserializer");
		properties.put("value.deserializer",
		    "org.apache.kafka.common.serialization.StringDeserializer");
		KafkaConsumer<Integer, String> consumer = new KafkaConsumer<Integer, String>(properties);
		consumer.subscribe(Collections.singletonList("library-events"));
		
		try {
			while(true) {
				@SuppressWarnings("deprecation")
				ConsumerRecords<Integer, String> records = consumer.poll(100);
				for(ConsumerRecord<Integer, String> record : records) {
					log.info("Given records are {} ", record);
				}
			}
		}finally {
			consumer.close();
		}
	}
	 */
}
