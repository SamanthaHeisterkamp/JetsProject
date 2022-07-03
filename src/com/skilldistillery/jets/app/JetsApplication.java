package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.BroomCloset;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BroomCloset broomCloset = new BroomCloset();
		JetsApplication jA = new JetsApplication();
		broomCloset.readJets();
		
		
//		while { //user story #4
			int wandMovement = 0;
			System.out.println("***Please choose your wand movement:***");
			System.out.println(" ______________________________________");
			System.out.println("| (1)Accio Sweep of Brooms.            |");
			System.out.println("| (2)Wingardium Leviosa all Brooms.    |");
			System.out.println("| (3)Accio fastest Broom.              |");
			System.out.println("| (4)Accio Broom with Longest Range.   |");
			System.out.println("| (5)Locomotor all Cargo Brooms.       |");
			System.out.println("| (6)Quidditch!                        |");
			System.out.println("| (7)Geminio a Broom to the Sweep.     |");
			System.out.println("| (8)Evanesco a Broom from the Sweep.  |");
			System.out.println("| (9)Finite Incantatem.                |");
			System.out.println("|______________________________________|");
			wandMovement = sc.nextInt();
			
			if (wandMovement < 10) {
				switch (wandMovement) {
				case 1:
					broomCloset.listSweepOfBrooms();
					break;
				}
			}
		}
	}



