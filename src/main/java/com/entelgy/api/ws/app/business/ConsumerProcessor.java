package com.entelgy.api.ws.app.business;

import org.springframework.stereotype.Component;

import com.entelgy.api.ws.app.model.CommentsConsumer;

@Component
public class ConsumerProcessor {

	
	public String convert (CommentsConsumer consumer) { 
		
		return consumer.getPostId()+"/"+consumer.getId()+"/"+consumer.getEmail();
	}
}
