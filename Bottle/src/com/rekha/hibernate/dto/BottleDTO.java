package com.rekha.hibernate.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="bottle")
public class BottleDTO implements Serializable
{
	@Id
	@GenericGenerator(name="rekha",strategy="increment")
	@GeneratedValue(generator="rekha")
	@Column(name="bid")
    private int bid;
	@Column(name="brand")
	private String brand;
	@Column(name="price")
	private double price;
	@Column(name="type")
	private String type;
		
	
  public BottleDTO()
{
	System.out.println("calling the constructor");
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
}
