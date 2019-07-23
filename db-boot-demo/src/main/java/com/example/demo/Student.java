package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private String name;
	private String school;
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", school=" + school + "]";
	}
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}


}
