package com.learning;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.learning.model.Employee;
import com.learning.model.EmployeeDao;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		EmployeeDao dao = ioc.getBean(EmployeeDao.class);
 
//		OPERATION 1: Insert value
		
//		Employee emp = new Employee(1, "Shristi", "Female", 45000);
//		dao.saveEmployee(emp);
//		System.out.println("Save Successfully..........");

//		OPERATION 2: Update value
		
//		dao.updateEmployee(emp);
//		System.out.println("row updated successfully.....");

//        OPERATION 3: DELETE value  
		
		 dao.deleteEmployee(7); 
		 System.out.println(" row deleted..........");


		// OPERATION 4: SELECT ALL 
		 
	   List<Employee> list = dao.getAllEmp();
	   for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("------------------------------------");
		
	}
}