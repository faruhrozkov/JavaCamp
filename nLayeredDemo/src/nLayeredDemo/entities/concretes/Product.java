package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
 private int  id;
 private int catagoryId;
 private String name;
 private double unitePrice;
 private int unitsInStoc;
 
 public Product(){}
 
 
 public Product(int id, int catagoryId, String name, double unitePrice, int unitsInStoc) {
	super();
	this.id = id;
	this.catagoryId = catagoryId;
	this.name = name;
	this.unitePrice = unitePrice;
	this.unitsInStoc = unitsInStoc;
}
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCatagoryId() {
	return catagoryId;
}
public void setCatagoryId(int catagoryId) {
	this.catagoryId = catagoryId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getUnitePrice() {
	return unitePrice;
}
public void setUnitePrice(double unitePrice) {
	this.unitePrice = unitePrice;
}
public int getUnitsInStoc() {
	return unitsInStoc;
}
public void setUnitsInStoc(int unitsInStoc) {
	this.unitsInStoc = unitsInStoc;
}

 
}
