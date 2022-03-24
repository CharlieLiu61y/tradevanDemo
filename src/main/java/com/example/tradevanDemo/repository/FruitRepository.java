package com.example.tradevanDemo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tradevanDemo.entity.Fruit;


@Repository
public interface FruitRepository extends JpaRepository<Fruit, String> {
	List<Fruit> findAll();
	List<Fruit> findById(BigDecimal id);
	Fruit deleteById(BigDecimal id);
}
