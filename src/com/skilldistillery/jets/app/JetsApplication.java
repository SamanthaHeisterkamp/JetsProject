package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.BroomCloset;

public class JetsApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BroomCloset broomCloset = new BroomCloset();
		JetsApplication jA = new JetsApplication();
		broomCloset.assembleSweep("jets.csv");

		System.out.println("I solemly swear that I am up to no good.");
		System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~* ");
		boolean loop = true;
		while (loop) { // user story #4
			System.out.println("*~*Please choose your wand movement:*~*");
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
			int wandMovement = 0;
			wandMovement = sc.nextInt();

			if (wandMovement < 10) {
				switch (wandMovement) {
				case 1:
					broomCloset.listSweepOfBrooms();
					break;
				case 2:
					broomCloset.wingardiumLeviosa();
					break;
				case 3:
					broomCloset.accioFastestBroom();
					break;
				case 4:
					broomCloset.accioBroomWithLongestRange();
					break;
				case 5:
					broomCloset.locomotor();
					break;

				case 6:
					broomCloset.quidditch();
					break;
				case 7:
					broomCloset.geminioABroomToTheSweep(sc);
					break;
				case 8:
					broomCloset.evanescoABroomFromTheSweep(sc);
					break;
				case 9:
					System.out.println("Mischief Managed.");
					loop = false;
					break;
				default:
					System.out.println("Messrs Moony, Wormtail, Padfoot, and Prongs");
					System.out.println("...offer their compliments to Professor Snape,");
					System.out.println("and request he keep his abnormally large nose");
					System.out.println("...out of other people's business.");
					System.out.println(" ");
					break;
				}
			}
		}
	}
}
