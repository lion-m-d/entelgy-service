package com.entelgy.api.ws.app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entelgy.api.ws.app.configuration.ApiConsumer;
import com.entelgy.api.ws.app.model.CommentsConsumer;
import com.entelgy.api.ws.app.model.response.CommentsResponse;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

@Service
public class ConsumerServiceImpl implements ConsumerService{
	

	@Autowired
	private ApiConsumer consumer;
	
	@Autowired
	private ConsumerProcessor processor;

	@Override
	public Single<CommentsResponse> getApi() {
		
		return  getApiToObservable()
				.map(processor::convert).toList()
				.map(response -> new CommentsResponse(response))
				.subscribeOn(Schedulers.io());
	}

	
	private Observable<CommentsConsumer> getApiToObservable() {
		
		return  consumer.getApi()
				.flatMapObservable(Observable::fromIterable)
				.subscribeOn(Schedulers.io());
	}



}
