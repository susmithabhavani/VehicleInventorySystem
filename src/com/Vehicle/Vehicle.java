package com.Vehicle;

public class Vehicle {
	private String vname;
	private int year;
	private double price;
	
	public Vehicle(String vname, int year, double price) {
		super();
		this.vname = vname;
		this.year = year;
		this.price = price;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
