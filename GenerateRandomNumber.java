package com.testing.ahmed;

import java.util.Random;

import com.testing.ahmed.Bowlingprogrambowlers_Bprgb.Match;
import com.testing.ahmed.Bowlingprogrambowlers_Bprgb.PlayBallPlayMatchMatchStatistics;

public class GenerateRandomNumber {

	long seedrandom;
	double randomgenerated;

	GenerateRandomNumber(){
		seedrandom = 3600; //make it 3600 for 4 bowlers 900 balls each to maintain random number like sequence
		randomgenerated=0;
	}

	Random generator = new Random();

	public int generateRandomNumber() { 
	
		int randomnumbergen;
		randomnumbergen=0;
		int randomnumbergentemp;
		randomnumbergentemp=0;
		randomgenerated = generator.nextDouble();
		System.out.println("randomgenerated - "+randomgenerated);
		randomnumbergen=(int) (randomgenerated*100);
		System.out.println("randomgenerated - "+randomnumbergen);
		return randomnumbergen;
	}
	
}
