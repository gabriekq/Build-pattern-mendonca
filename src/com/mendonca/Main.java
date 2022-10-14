package com.mendonca;

public class Main {

	public static void main(String[] args) {
		
	  CarBuilder carBulder = new CarBuilder();
		
	  Director director = new Director();
	  
	  director.defaultCar(carBulder);
	   Car modelT = carBulder.build();
	   System.out.println(modelT);
	   

	}

}
