package com.amit.bookservice.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "book")
public class Book {

	@Id
	private String id;
	private String barcode;
	private String Title;
	private String Type;
	private BigDecimal Price;

	public Book() {

	}

	public Book(String id, String barcode, String title, String type, BigDecimal price) {
		super();
		this.id = id;
		this.barcode = barcode;
		Title = title;
		Type = type;
		Price = price;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public BigDecimal getPrice() {
		return Price;
	}

	public void setPrice(BigDecimal price) {
		Price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
