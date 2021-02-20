package com.example.m9.response;

import java.util.List;

import com.example.m1.dto.NewsFeed;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NewsFeedResponse {
	
	private List<NewsFeed> newsFeed;
	private String errrorMsg;
	
	public NewsFeedResponse(String errrorMsg) {
		this.errrorMsg=errrorMsg;
	}
}
