package com.example.tradevanDemo.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FruitRequest {

	@JsonProperty("id")
	private BigDecimal id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("number")
	private BigDecimal number;

	@JsonProperty("price")
	private BigDecimal price;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNumber() {
		return number;
	}

	public void setNumber(BigDecimal number) {
		this.number = number;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
