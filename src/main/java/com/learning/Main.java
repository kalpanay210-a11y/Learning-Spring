package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.model.Address;
import com.learning.model.Employee;

public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee obj = (Employee) factory.getBean("emp1");
		
		System.out.println(obj);
		
		obj.setAddress(obj.applyAddress());
		System.out.println(obj);
		Address a1 = obj.applyAddress();
		System.out.println(a1);
	}

}
