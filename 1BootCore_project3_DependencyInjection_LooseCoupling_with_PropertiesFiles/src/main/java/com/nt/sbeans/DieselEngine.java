package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEng")
public class DieselEngine implements Engine {
	public DieselEngine() {
		System.out.println("Object is Created: DieselEngine");
	}

	@Override
	public void startEngine() {
		System.out.println("DieselEngine.startEngine()");

	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine.stopEngine()");

	}

}
