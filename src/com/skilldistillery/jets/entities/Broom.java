package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Broom {
	private String broomName = "";
	private double broomSpeed = 0;
	private int broomRange = 0;
	private long broomPrice = 0;
	
	
	public Broom () {
		super();
	}
	public Broom(String broomName, double broomSpeed, int broomRange, long broomPrice) {
		super();
		this.broomName = broomName;
		this.broomPrice = broomPrice;
		this.broomRange = broomRange;
		this.broomPrice = broomPrice;
	} 
//	generate getters and setters cmd/opt/s
	public String getBroomName() {
		return broomName;
	}
	public void setBroomName(String broomName) {
		this.broomName = broomName;
	}
	public double getBroomSpeed() {
		return broomSpeed;
	}
	public void setBroomSpeed(double broomSpeed) {
		this.broomSpeed = broomSpeed;
	}
	public int getBroomRange() {
		return broomRange;
	}
	public void setBroomRange(int broomRange) {
		this.broomRange = broomRange;
	}
	public long getBroomPrice() {
		return broomPrice;
	}
	public void setBroomPrice(long broomPrice) {
		this.broomPrice = broomPrice;
	}
	
	
	@Override // generate hashcode and equals
	public int hashCode() {
		return Objects.hash(broomName, broomPrice, broomRange, broomSpeed);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Broom other = (Broom) obj;
		return Objects.equals(broomName, other.broomName) && broomPrice == other.broomPrice
				&& broomRange == other.broomRange
				&& Double.doubleToLongBits(broomSpeed) == Double.doubleToLongBits(other.broomSpeed);
	}
	@Override //generate toString, clean it up. 
	public String toString() {
		return " Broom Name: " + broomName + " Broom Speed: " + broomSpeed +
				" Broom Range: " + broomRange + " Broom Price; " + broomPrice;
		
	}
}
