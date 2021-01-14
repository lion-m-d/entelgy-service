package com.entelgy.api.ws.app.model.response;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentsResponse implements Serializable {


	private static final long serialVersionUID = 2034343268308913546L;
	private List<String> data;
}
