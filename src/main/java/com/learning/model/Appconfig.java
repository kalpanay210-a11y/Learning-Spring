package com.learning.model;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class Appconfig {

	@Bean
	DataSource dataSource() {
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		
		driverManagerDataSource.setUrl("jdbc:mysql:/localhost:3306/mydb");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root@123");
		driverManagerDataSource.setDriverClassName("com.learning.model");
		return driverManagerDataSource;
	}
	
}
