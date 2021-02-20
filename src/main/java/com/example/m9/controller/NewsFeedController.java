package com.example.m9.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.m9.request.NewsFeedRequest;
import com.example.m9.response.NewsFeedResponse;
import com.example.m9.service.NewsFeedService;

@RestController
@RequestMapping("/api/news-feed")
public class NewsFeedController {
	
	@Autowired
	NewsFeedService service;
	
	@GetMapping("/get")
	public ResponseEntity<NewsFeedResponse> getNewsFeed(@Valid @RequestBody NewsFeedRequest request) {
		
		if(request.getType().equals("spec")&& request.getWriterId()==null) {
			return ResponseEntity
					.badRequest().body(new NewsFeedResponse("Must specify writer id"));
		}
		
		NewsFeedResponse response = service.procesResponse(request);
		return ResponseEntity
				.ok().body(response);
		
	}

}
