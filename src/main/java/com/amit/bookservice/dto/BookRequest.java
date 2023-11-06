package com.amit.bookservice.dto;

import java.math.BigDecimal;

public class BookRequest {

	private Long id;
	private String barcode;
	private String Title;
	private String Type;
	private BigDecimal Price;
	

	public BookRequest(Long id,String barcode, String title, String type, BigDecimal price) {
		super();
		this.id=id;
		this.barcode = barcode;
		this.Title = title;
		this.Type = type;
		this.Price = price;
	}

	public BookRequest() {
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
