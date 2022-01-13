package com.example.ClientDbJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="student")
public class StudentPojo {
	@Id
	private int rollnum;
	@Column
	private String Firstname;
	@Column
	private String Lastname;
	
	public StudentPojo() {
		super();
	}

	public StudentPojo(int rollnums, String Firstname, String Lastname) {
		super();
		this.rollnum = rollnums;
		this.Firstname = Firstname;
		this.Lastname = Lastname;
	}
	
	public int getrollnum() {
		return rollnum;
	}

	public void setrollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}
	
	
	
}
