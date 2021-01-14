package com.entelgy.api.ws.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.api.ws.app.business.ConsumerService;
import com.entelgy.api.ws.app.model.response.CommentsResponse;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

@RestController
@RequestMapping("${controller.request}")
public class ControllerWeb {
	
	@Autowired
	private ConsumerService service;

	
	@PostMapping("${request.post}")
	public Single<CommentsResponse> consumer(){

		return service.getApi()
				.subscribeOn(Schedulers.io());
	}


}



