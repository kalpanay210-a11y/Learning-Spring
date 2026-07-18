package com.learning.model;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employee> getAllEmp() {
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new EmployeeMapper());
	}

	public int saveEmployee(Employee emp) {
		String sql = "insert into employee (emp_id, emp_name, emp_salary, emp_gender) values (?, ?, ?, ?)";
		return jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getSalary(), emp.getGender());
	}

	public int updateEmployee(Employee emp) {
		String sql = "update employee set emp_name = ?, emp_salary = ?, emp_gender = ? where emp_id = ?";
		return jdbcTemplate.update(sql, emp.getName(), emp.getSalary(), emp.getGender(), emp.getId());
	}

	public int deleteEmployee(int id) {
		String sql = "delete from employee where emp_id = ?";
		return jdbcTemplate.update(sql, id);
	}
}