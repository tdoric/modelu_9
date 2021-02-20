package com.example.m9.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.m1.repository.NewsFeedRepo;
import com.example.m9.request.NewsFeedRequest;
import com.example.m9.response.NewsFeedResponse;

@Component
public class StrategySpecific implements Strategy {
	
	@Autowired
	NewsFeedRepo repo;

	@Override
	public NewsFeedResponse response(NewsFeedRequest request) {
		NewsFeedResponse news = new NewsFeedResponse();
		news.setNewsFeed(repo.gettNewsFeedByUser(request.getWriterId()));
		return news;
	}

	@Override
	public StrategyName getStrategyName() {
		return StrategyName.STRATEGY_SPECIFIC;
	}

}
