package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("cEng")
public class CNGEngine implements Engine {
	
	// define constrcter
	public CNGEngine() {
		System.out.println("Object is Created: CNGEngine");
	}

	@Override
	public void startEngine() {
		System.out.println("CNGEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("CNGEngine.stopEngine()");

	}

}
