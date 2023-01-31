package com.java.instance;

public class FlightRunner {
  public static void main(String[] args) {
	System.out.println("printing about flight");
	Flight flight=new Flight();
	flight.name="royal";
	flight.noOfSheets=26;
	flight.noOfWorkers=13;
	flight.waystotravel="Belagavi to Bengalor";
	flight.type="domain";
	flight.size=18.8D;
	flight.hight=106.4D;
	flight.cast=600;
	flight.duration=6.2D;
	flight.number=5;
	 flight.display();
	 System.out.println("------------------");
	 Flight flight1=new Flight();
	 flight1.display();
	 flight1=flight;
	 flight.display();
}
}
