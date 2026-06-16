package com.example.orm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.List;

import com.example.orm.Laptop;
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
	
	@OneToMany
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
		return "student [rollNo=" + rollNo + ", sName=" + sName + ", sAge=" + sAge + ", laptops=" + laptops + "]";
	}

	
}