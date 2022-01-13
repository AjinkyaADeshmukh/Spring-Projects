package com.example.ClientDbJPA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
	
	@Autowired
	private MyJPAInterface myjpa;

	
	
	public void addStudent(int id, String fname, String lname) {
		StudentPojo sp = new StudentPojo(id,fname,lname);
		
		myjpa.save(sp);
		
	}
}
