package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BroomCloset {
	public List<Broom> sweep = new ArrayList<>();
	public Object setSweep = sweep;
	Scanner sc = new Scanner(System.in);

	public BroomCloset() {
	}

	public void assembleSweep(String fileName) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			String type;
			String name;
			int speed;
			int range;
			int price;

			while ((line = bufIn.readLine()) != null) {
				String[] broomInfo = line.split(",");
				type = broomInfo[0];
				name = broomInfo[1];
				speed = Integer.parseInt(broomInfo[2]);
				range = Integer.parseInt(broomInfo[3]);
				price = Integer.parseInt(broomInfo[4]);

				if (type.equals("Airliner")) {
					sweep.add(new Airliner(type, name, speed, range, price));
				} else if (type.equals("Fighter")) {
					sweep.add(new Fighter(type, name, speed, range, price));
				} else if (type.equals("Cargo")) {
					sweep.add(new Cargo(type, name, speed, range, price));
				} else if (type.equals("Surveillance")) {
					sweep.add(new Surveillance(type, name, speed, range, price));
				} else if (type.equals("Tanker")) {
					sweep.add(new Tanker(type, name, speed, range, price));
				}

			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void listSweepOfBrooms() { // case 1
		for (Broom broom : sweep) {
			System.out.println(broom.toString());
			System.out.println("----------------------------------------------------------------");
		}
	}

	public void wingardiumLeviosa() { // case 2
		for (Broom broom : sweep) {
			broom.wingardiumLeviosa();
			broom.toString();
		}
	}

	public void accioFastestBroom() { // case 3
		double fastestBroom = 0;
		Broom accioFastestBroom = null;

		for (Broom broom : sweep) {

			if (fastestBroom < broom.getBroomSpeed()) {
				fastestBroom = broom.getBroomSpeed();
				accioFastestBroom = broom;
			}
		}
		if (accioFastestBroom != null) {
			System.out.println("The fastest Broom in the Sweep is: \n" + accioFastestBroom);
			System.out.println("----------------------------------------------------------------");
		}
	}

	public void accioBroomWithLongestRange() { // case 4
		double longestRange = 0;
		Broom longRange = null;

		for (Broom broom : sweep) {
			if (longestRange < broom.getBroomRange()) {
				longestRange = broom.getBroomRange();
				longRange = broom;
			}
		}
		if (longRange != null) {
			System.out.println("The broom with the longest range is: \n" + longRange);
			System.out.println("---------------------------------------------------------------");
		}
	}

	public void locomotor() { // case 5
		for (Broom broom : sweep) {
			if (broom instanceof Cargo) {
				((Cargo) broom).loadCargo();
			}
		}

	}

	public void quidditch() { //case 6
		for (Broom broom : sweep) {
			if (broom instanceof Fighter) {
				((Fighter)broom).quidditch();
			}
		}
			
		}
		public void geminioABroomToTheSweep(Scanner sc) { //case 7
			String type = "Tanker";
			String newName;
			double newSpeed;
			int newRange;
			long newPrice;
			
			System.out.println("Add your broom to the closet: ");
			newName = sc.next();
			System.out.println("How fast can your broom fly?");
			newSpeed = sc.nextDouble();
			System.out.println("What is the range in miles your broom can fly?");
			newRange = sc.nextInt();
			System.out.println("How many galleons does your broom cost?");
			newPrice = sc.nextLong();
			
			BroomImp newBroom = new BroomImp(type, newName, newSpeed, newRange, newPrice);
			sweep.add(newBroom);
			System.out.println("Your new Broom: " + newName + " is added to the Sweep!");
		}
	public void	evanescoABroomFromTheSweep(Scanner sc) {
		System.out.println("Please choose the broom you would like to Evanesco from the Sweep: ");
		int evanesco = 1;
		for (int i = 0; i < sweep.size(); i++) {
			System.out.println( evanesco + " " + sweep.get(i).getBroomName());
		evanesco ++;
		
		}
		int input = sc.nextInt();
		sweep.remove(input - 1);
	}
}


