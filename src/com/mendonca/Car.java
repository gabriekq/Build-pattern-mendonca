package com.mendonca;

public class Car {

	private int id;
	private String brand;
	private String model;
	private String color;
	private int nbrDoors;
	private String screenType;
	private double weight;
	private double height;
	

	public Car(int id, String brand, String model, String color, int nbrDoors, String screenType, double weight,
			double height) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.nbrDoors = nbrDoors;
		this.screenType = screenType;
		this.weight = weight;
		this.height = height;
	}
	
	
	


	public void setId(int id) {
		this.id = id;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setModel(String model) {
		this.model = model;
	}



	public void setColor(String color) {
		this.color = color;
	}


	public void setNbrDoors(int nbrDoors) {
		this.nbrDoors = nbrDoors;
	}


	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", model=" + model + ", color=" + color + ", nbrDoors=" + nbrDoors
				+ ", screenType=" + screenType + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	
	
}
