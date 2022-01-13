package com.example.ClientDb;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@ComponentScan(basePackages = {"controlpack","daopack","pojopack"})
@SpringBootApplication
public class ClientDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientDbApplication.class, args);
	}
	
	@Bean
	public DataSource getds() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/db1");
		dm.setUsername("root");
		dm.setPassword("Ajinkya@321");
		 
		return dm;

	}
}
