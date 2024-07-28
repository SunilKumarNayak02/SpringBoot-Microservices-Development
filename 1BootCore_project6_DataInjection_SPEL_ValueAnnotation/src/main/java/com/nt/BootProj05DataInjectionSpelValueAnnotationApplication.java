package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.HotelInfo;
import com.nt.sbeans.HotelMenu;

@SpringBootApplication
public class BootProj05DataInjectionSpelValueAnnotationApplication {

	public static void main(String[] args) {
		 //get IOC container
		ApplicationContext ctx=
				  SpringApplication.run(BootProj05DataInjectionSpelValueAnnotationApplication.class, args);
		 //get HotelMenu class object
		HotelMenu menu=ctx.getBean("menu",HotelMenu.class);
		System.out.println(menu);
		//get HotelInfo Object
		HotelInfo info=ctx.getBean("hInfo",HotelInfo.class);
		System.out.println(info);
		System.out.println("----------------------------------------");
		Environment  env=ctx.getEnvironment();
		System.out.println(env.getProperty("os.name"));
		System.out.println(env.getProperty("hotel.name"));
		//close the container
		 ((ConfigurableApplicationContext) ctx).close();
	}

}
