package com.example.tradevanDemo.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.tradevanDemo.dto.FruitRequest;
import com.example.tradevanDemo.entity.Fruit;
import com.example.tradevanDemo.repository.FruitRepository;
import com.example.tradevanDemo.service.FruitService;

@Service
@Aspect
public class FruitServiceImpl implements FruitService {

	@Autowired
	private FruitRepository fruitRepository;
	
	private BigDecimal applePrice = new BigDecimal(10);
	private BigDecimal bananaPrice = new BigDecimal(8);
	private BigDecimal orangePrice = new BigDecimal(12);

	@Override
	@Transactional
	public String addFruit(FruitRequest fruitRequest) {

		BigDecimal fruitId = fruitRequest.getId();
		String fruitName = fruitRequest.getName();
		BigDecimal fruitNumber = fruitRequest.getNumber();
		
		BigDecimal price = new BigDecimal(0);
		if(new BigDecimal(1).compareTo(fruitId) == 0) {
			price = applePrice;
		} else if(new BigDecimal(2).compareTo(fruitId) == 0) {
			price = bananaPrice;
		} else {
			price = orangePrice;
		}
		
		Fruit oldFruit = fruitRepository.findById(fruitId).get(0);
		fruitRepository.delete(oldFruit);
		
		BigDecimal newFruitNumber = fruitNumber.add(oldFruit.getNumber());
		BigDecimal newFruitPrice = price.multiply(newFruitNumber);
		Fruit fruit = new Fruit();
		fruit.setId(fruitId);
		fruit.setName(fruitName);
		fruit.setNumber(newFruitNumber);
		fruit.setPrice(newFruitPrice);

		List<Fruit> fruitList = new ArrayList<>();
		fruitList.add(fruit);

		fruitRepository.saveAll(fruitList);
		return "新增" + fruitName + "," + fruitNumber + "顆";
	}

	@Override
	public List<Fruit> checkout() {
		return fruitRepository.findAll();
	}
}
