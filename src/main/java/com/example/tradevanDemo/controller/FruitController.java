package com.example.tradevanDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tradevanDemo.dto.FruitRequest;
import com.example.tradevanDemo.entity.Fruit;
import com.example.tradevanDemo.service.FruitService;

@RestController
public class FruitController {

	@Autowired
	private FruitService fruitService;

	@PostMapping("/insert")
	public String addFruit(@RequestBody FruitRequest fruitRequest) {

		return fruitService.addFruit(fruitRequest);
	}

	@PostMapping("/query")
	public List<Fruit> checkout() {

		return fruitService.checkout();
	}

}
