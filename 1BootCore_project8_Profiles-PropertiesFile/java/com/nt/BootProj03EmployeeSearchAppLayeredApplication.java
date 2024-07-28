package com.nt;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controller.EmployeeOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03EmployeeSearchAppLayeredApplication {

	public static void main(String[] args) {
		  //get the ApplicationContext container
		ApplicationContext ctx=SpringApplication.run(BootProj03EmployeeSearchAppLayeredApplication.class, args);
		//get the Controller class objecvt
		EmployeeOperationsController controller=ctx.getBean("empController",EmployeeOperationsController.class);
		//invoke the b.method
		try {
			List<Employee> list=controller.showEmployeesByDesgs("clerk", "MANAGER", "SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("------------------------------To Access The profiles using Programatic Approach ----------------------------------------------------------------------------");
		Environment env=ctx.getEnvironment();
		// which profile active it will show the profile name
		System.out.println("Current Profiles:: "+Arrays.toString(env.getActiveProfiles()));
		
	}//main

}//class
