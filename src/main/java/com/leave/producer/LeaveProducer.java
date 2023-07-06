package com.leave.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class LeaveProducer {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	public void sendMessage(String msg) {
		kafkaTemplate.send("SampleTopic", "Hello");
	}

}
