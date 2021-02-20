package com.example.m9.strategy;

import com.example.m9.request.NewsFeedRequest;
import com.example.m9.response.NewsFeedResponse;

public interface Strategy {
	
	public NewsFeedResponse response(NewsFeedRequest request);
	StrategyName getStrategyName();
	
	public enum StrategyName {
		  STRATEGY_ALL,
		  STRATEGY_SPECIFIC
		}
}
