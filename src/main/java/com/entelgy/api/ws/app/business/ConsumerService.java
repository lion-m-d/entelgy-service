package com.entelgy.api.ws.app.business;

import com.entelgy.api.ws.app.model.response.CommentsResponse;

import io.reactivex.Single;

public interface ConsumerService {

	public Single<CommentsResponse>  getApi();
}
