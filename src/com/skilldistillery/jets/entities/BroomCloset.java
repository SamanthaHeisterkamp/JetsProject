package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BroomCloset {
	ArrayList<Broom> sweep = new ArrayList<Broom>();

	String jets = "jets.csv";
//	private List<Broom> sweep; //creating the empty list of brooms

	public BroomCloset(String jets) {
		super();
		this.jets = jets;
	}

	public BroomCloset() {
		super();
	}

	public BroomCloset(String jets, BroomCloset bC) {
		super();
		this.jets = jets;
	}

	public void readJets() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.csv"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {

				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void listSweepOfBrooms() {
		for (Broom broom : sweep) {
			System.out.println(broom.toString());

		}
	}

}
