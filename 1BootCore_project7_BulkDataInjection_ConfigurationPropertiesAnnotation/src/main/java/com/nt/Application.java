package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.CompanyInfo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//get IOC Container
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
		
		//get Spring bean Class
		CompanyInfo info=ctx.getBean("ci" , CompanyInfo.class);
		System.out.println(info);
		//Close the container
	((ConfigurableApplicationContext) ctx).close();
	}

}
