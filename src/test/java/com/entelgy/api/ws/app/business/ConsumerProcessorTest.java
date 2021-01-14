package com.entelgy.api.ws.app.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.entelgy.api.ws.app.model.CommentsConsumer;

@RunWith(MockitoJUnitRunner.class)
public class ConsumerProcessorTest {
	

	@InjectMocks
	private ConsumerProcessor processor;
	
	
	@Test
	public void convertTestOk() {

		CommentsConsumer consumer = new CommentsConsumer(1,1,"entelgy","entelgy@gmail.com",
				"comments response");

		String response = processor.convert(consumer);

		assertNotNull(response);
		assertEquals(response,"1/1/entelgy@gmail.com");
	}

}
