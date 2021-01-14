package com.entelgy.api.ws.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CommentsConsumer {

	private int postId;
	private int id;
	private String name;
	private String email;
	private String body;
}
