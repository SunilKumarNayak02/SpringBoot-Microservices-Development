package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEng")
public class ElectricEngine implements Engine {
	
	public ElectricEngine() {
		System.out.println("Obejct is created : Electric Engine");
	}
	@Override
	public void startEngine() {
		System.out.println("ElectricEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricEngine.stopEngine()");

	}

}
