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
	System.out.println("Your broom today is: " );
	if (broomType.equals("Fighter")) {
		System.out.println(toString());
	}
	System.out.println(" ");
	System.out.println("Players take their positions in the air.");
	System.out.println("...and the game begins!");
	System.out.println(" ");
	System.out.println("Gryffindor takes the Quaffle, Johnson throws it...");
	System.out.println("		SCORE!");
	System.out.println(" ");
	System.out.println("You go into a nosedive, pull your broom up, stand up, step forward...");
	System.out.println("Reaching for the snitch...");
	System.out.println(" ");
	System.out.println("You reach too far, topple over and tumble on the ground.");
	System.out.println("You lurch and the snitch pops out of your mouth!");
	System.out.println("	  GRYFFINDOR WINS!");
	System.out.println(" ");
}
}

