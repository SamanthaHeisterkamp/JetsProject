package com.skilldistillery.jets.entities;

public class Fighter extends Broom {
	public Fighter() {
		super();
	}
	 
 public Fighter(String type, String name, double speed, int range, long price) {
	 super(type, name, speed, range, price);
	 
 }

public void quidditch() {
	System.out.println("Welcome to Hogwarts first Quidditch game of the season!");
	System.out.println("Today's game is Slytherin versus Gryffindor!");
	System.out.println(" ");
	System.out.println("Players take their positions in the air.");
	System.out.println("...and the game begins!");
	System.out.println(" ");
	System.out.println("Gryffindor takes the Quaffle, Johnson throws it...");
	System.out.println("		SCORE!");
	System.out.println("Harry goes into a nosedive, pulls his broom up, stands up, steps forward...");
	System.out.println("Reaching for the snitch...");
	System.out.println("He reaches too far, topples over and tumbles on the ground.");
	System.out.println("Harry lurches and the snitch pops out of his mouth!");
	System.out.println("	  GRYFFINDOR WINS!");
}
}

