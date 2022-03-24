package com.example.tradevanDemo.service;

import java.util.List;

import com.example.tradevanDemo.dto.FruitRequest;
import com.example.tradevanDemo.entity.Fruit;

public interface FruitService {

	public String addFruit(FruitRequest fruitRequest);
	
	public List<Fruit> checkout();
	
}
