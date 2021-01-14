package com.entelgy.api.ws.app.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class ApiConfiguration {

	 private static Retrofit retrofit = null;

	 @Value("${consumer.ruta}")
	 private String ruta;

	    @Bean
	    public ApiConsumer apiProxy() {
	    	
	    	if (retrofit==null) {
	            retrofit = new Retrofit.Builder()
	            		.baseUrl(ruta)
	                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
	                    .addConverterFactory(GsonConverterFactory.create())
	                    .build();
	        }
	        return retrofit.create(ApiConsumer.class);
	    }
}
