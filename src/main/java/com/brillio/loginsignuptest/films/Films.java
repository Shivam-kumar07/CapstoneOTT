package com.brillio.loginsignuptest.films;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Films {
	
	@Id
	String label;
	int year;
	
	public Films() {
		super();
	}
	public Films(String label, int year) {
		super();
		this.label= label;
		this.year = year;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label= label;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
