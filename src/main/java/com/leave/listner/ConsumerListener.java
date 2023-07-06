package com.leave.listner;

import org.springframework.kafka.annotation.KafkaListener;

public class ConsumerListener {
	@KafkaListener(topics="SampleTopic", groupId = "group1")
	public void listen(String message) {
		System.out.println("Received --- " + message);
	}
}
