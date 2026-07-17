package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.model.Address;
import com.learning.model.Employee;

public class Main {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("application-context.xml");
		Employee obj = factory.getBean("emp1", Employee.class);
		System.out.println(obj);
	    factory.registerShutdownHook();
		
	}

}
