package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	public Vehicle() {
		System.out.println("Object is Created: Vehicle");
	}
	
	//@Qualifier("eEng")
	@Value("${Engine.id}")
  private Engine engg;
	
	//b logic
	
	public void Journey(String sourcePlace , String destPlace) {
		System.out.println("Vehicle.Journey():: Journey is started......"+sourcePlace);
		engg.startEngine();
		
		System.out.println("Vehicle.Journey():: Journey is going on.......");
		
		engg.stopEngine();
		System.out.println("Vehicle.Journey():: Journey Completed...."+destPlace);
	}
	
}
