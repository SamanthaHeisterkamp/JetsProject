package com.skilldistillery.jets.entities;

public class Cargo extends Broom implements CargoCarrier{
	public Cargo() {
		super();
	}
	 
 public Cargo(String type, String name, double speed, int range, long price) {
	 super(type, name, speed, range, price);
	 
 }
 public void loadCargo() {
	 System.out.println("Loading school Trunk.");
	 System.out.println("Trunk secure, flying to Hogwarts!");
 }
}

