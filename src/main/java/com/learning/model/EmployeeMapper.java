package com.learning.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {
 
	@Override
	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
		Employee emp = new Employee();
		
		emp.setId(resultSet.getInt("emp_id"));
		emp.setName(resultSet.getString("emp_name"));
		emp.setGender(resultSet.getString("emp_gender"));
		emp.setSalary(resultSet.getInt("emp_salary"));
		
		return emp;
	}
}