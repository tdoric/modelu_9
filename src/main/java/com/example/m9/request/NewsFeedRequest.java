package com.example.m9.request;

import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class NewsFeedRequest {
	
	private String type;
	private Integer writerId;

}
