package com.example.orm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Student_Details")
public class student {
	@Id
	private int rollNo;
	private String sName;
	private int sAge;
//	@OneToOne
//	private List<Laptop> laptops;
//	public int getRollNo() {
//		return rollNo;
//	}
	
	@OneToMany(mappedBy="std")//to remove creation of 3rd table
	private List<Laptop> laptops;
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
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", sName=" + sName + ", sAge=" + sAge + "]";
	}

	
}