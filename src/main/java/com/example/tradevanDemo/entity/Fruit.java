package com.example.tradevanDemo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(FruitPk.class)
@Table(name = "fruit")
public class Fruit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private BigDecimal id;

	@Column(name = "name")
	private String name;

	@Column(name = "number")
	private BigDecimal number;

	@Column(name = "price")
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
