package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//get access the IOC Container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		//This method is used to retrieve beans from the IoC container. It takes two arguments:
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke the b. method
		vehicle.Journey("Banglore", "Odisha");
		vehicle.Journey("Odisha", "Hyderbad");
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
