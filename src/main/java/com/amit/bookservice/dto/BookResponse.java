package com.amit.bookservice.dto;

import java.math.BigDecimal;

public class BookResponse {

	private String barcode;
	private String Title;
	private String Type;
	private BigDecimal Price;
	private Long id;

	public BookResponse(Long id, String barcode, String title, String type, BigDecimal price) {
		super();
		this.barcode = barcode;
		this.Title = title;
		this.Type = type;
		this.Price = price;
		this.id=id;
	}

	public BookResponse() {
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
