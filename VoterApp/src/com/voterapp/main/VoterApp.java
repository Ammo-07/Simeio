package com.voterapp.main;
import com.voterapp.exception.InvalidVoterException;
import com.voterapp.service.ElectionBooth;
import com.voterapp.service.ElectionBoothImpl;

public class VoterApp {
	public static void main(String[] args) {
		ElectionBooth electionBooth = new ElectionBoothImpl();

		try {
		boolean isEligible = electionBooth.checkEligibility(25, "banglore", 131);
		System.out.println("Is Eligible: " + isEligible);
		} catch (InvalidVoterException e) {
		System.out.println(e.getMessage());
		}
		}
}
