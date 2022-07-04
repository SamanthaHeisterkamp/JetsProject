package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Broom {
	private String broomType = "";
	private String broomName = "";
	private double broomSpeed = 0;
	private int broomRange = 0;
	private long broomPrice = 0;
	private double flyTime = 0;
	
	
	public Broom () {
		super();
	}
	public Broom(String broomType, String broomName, double broomSpeed, int broomRange, long broomPrice) {
		super();
		this.setBroomType(broomType);
		this.broomName = broomName;
		this.broomSpeed = broomSpeed;
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
	public void setBroomSpeed(double broomSpeed) { //case 3
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
	public double getFlyTime() {
		flyTime = broomRange / broomSpeed;
		return flyTime;
	}
	public void setFlyTime(double flyTime) {
		this.flyTime = flyTime;
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
		return " 		Broom Name: " + broomName + "\nBroom Speed: " + broomSpeed +
				" Broom Range: " + broomRange + " Broom Price: " + broomPrice + " galleons.";
		
	}
	public void wingardiumLeviosa() { //case 2
		System.out.println(toString());
		System.out.println("	Up! Brooms max fly time is: " + getFlyTime() + " years.");
	}
	public String getBroomType() {
		return broomType;
	}
	public void setBroomType(String broomType) {
		this.broomType = broomType;
	}
}
