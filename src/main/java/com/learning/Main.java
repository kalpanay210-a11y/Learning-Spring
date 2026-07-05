package com.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.model.Employee;

public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee bean1 = ioc.getBean("emp1", Employee.class);
		System.out.println(bean1);
		
		Employee bean2 = ioc.getBean("emp1", Employee.class);
		System.out.println(bean2);
	}

}
