package com.mendonca;

public class Main {

	public static void main(String[] args) {
		
	   CarBuilder carBulder = new CarBuilder();
		
	   Car car =	carBulder.color("yellow").id(55).build();
	      
	   System.out.println(car.toString());
	
	   Car ferrari = new Car(55, null, null, "yellow", 0, null, 0,0);
	
	   System.out.println(ferrari.toString());
	   

	}

}
