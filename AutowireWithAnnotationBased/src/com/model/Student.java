package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	 private int rollno;
	 private String name;
	 @Autowired
	 private Address adr;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	 
}
