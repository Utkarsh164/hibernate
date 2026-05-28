package com.example.orm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.example.orm.Laptop;
@Entity
@Table(name = "Student_Details")
public class student {
	@Id
	private int rollNo;
	private String sName;
	private int sAge;
	private Laptop laptop;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", sName=" + sName + ", sAge=" + sAge + ", laptop=" + laptop + "]";
	}

	
}