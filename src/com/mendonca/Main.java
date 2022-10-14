package com.mendonca;

public class Main {

	public static void main(String[] args) {
		
	  Builder carBuilder = new CarBuilder();
		
	  Director director = new Director();
	  
	  director.defaultCar(carBuilder);
	   Car modelT = ((CarBuilder) carBuilder).build();
	   System.out.println(modelT);
	   

	}

}
