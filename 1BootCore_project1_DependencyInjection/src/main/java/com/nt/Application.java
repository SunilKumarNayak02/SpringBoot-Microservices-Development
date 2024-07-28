package com.nt;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class Application {
	
	 //create object for the LocalDate Time use of bean method
	@Bean("dt")
	public LocalDateTime createLdt() {
	    return LocalDateTime.now();
	}


	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		                          SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
		                          //invoke the b.Logic
		                          String result=finder.findSeasonName();
		                          System.out.println("Season Name: "+result);
		                          //Close the container
		                          ((ConfigurableApplicationContext) ctx).close();
	}

}
