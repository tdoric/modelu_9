package com.example.m9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.m9.request.NewsFeedRequest;
import com.example.m9.response.NewsFeedResponse;
import com.example.m9.strategy.Strategy;
import com.example.m9.strategy.Strategy.StrategyName;
import com.example.m9.strategy.StrategyFactory;

@Service
public class NewsFeedService {
	
	 @Autowired
	 private StrategyFactory strategyFactory;
	 
	 public NewsFeedResponse procesResponse(NewsFeedRequest request) {
		 Strategy strategy ;
		 if(request.getType().equals("all")) {
			strategy=strategyFactory.findStrategy(StrategyName.STRATEGY_ALL);
		 }else {
			 strategy=strategyFactory.findStrategy(StrategyName.STRATEGY_SPECIFIC);
		 }

		 return strategy.response(request);
		 
	 }

}
