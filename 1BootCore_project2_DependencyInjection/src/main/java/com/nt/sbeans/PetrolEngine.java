package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEng")
public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("Obejct is Created:  petrolEngine");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine.stopEngine()");

	}

}
