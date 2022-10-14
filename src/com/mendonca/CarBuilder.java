package com.mendonca;

public class CarBuilder  implements Builder {

	private int id;
	private String brand;
	private String model;
	private String color;
	private int nbrDoors;
	private String screenType;
	private double weight;
	private double height;
	
	
	public Car build() {
		return new Car(id, brand, model, color, nbrDoors, screenType, weight, height);
	}


	@Override
	public void Id(int id) {
		this.id = id;
		
	}


	@Override
	public void brand(String brand) {
		this.brand = brand;
		
	}



	@Override
	public void model(String model) {
		this.model = model;
		
	}



	@Override
	public void color(String color) {
		this.color = color;
		
	}



	@Override
	public void nbrDoors(int nbrDoors) {
		this.nbrDoors = nbrDoors;
		
	}



	@Override
	public void screenType(String screenType) {
		this.screenType = screenType;	
	}



	@Override
	public void weight(double weight) {
		this.weight = weight;		
	}



	@Override
	public void height(double height) {
		this.height = height;
		
	}
	
	
}
