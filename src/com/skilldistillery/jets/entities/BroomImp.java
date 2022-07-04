package com.skilldistillery.jets.entities;

public class BroomImp extends Broom {

	public BroomImp() {
		super();
	}
		
	public BroomImp(String broomType, String broomName, double broomSpeed, int broomRange, long broomPrice) {
		super(broomType, broomName, broomSpeed, broomRange, broomPrice);
	}
	@Override
	public String toString() {
		return "\tBroom Name: " + getBroomName() + "\n\tBroom Type: " + getBroomType() + " \nBroom Speed: " + getBroomSpeed()
				+ " Broom Range: " + getBroomRange() + " Broom Price: " + getBroomPrice();
	}

}
