package com.entelgy.api.ws.app.configuration;

import java.util.List;

import com.entelgy.api.ws.app.model.CommentsConsumer;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface ApiConsumer {
	
	@GET("comments")
	Single<List<CommentsConsumer>> getApi();

}
