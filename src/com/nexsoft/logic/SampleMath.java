package com.nexsoft.logic;

import java.util.Random;

public class SampleMath {

	public static void main(String[] args) {
		
		double rand= Math.random();
		System.out.println(rand);
		
		int max = 10;
		int min = 1;
		int range = max - min + 1;
		
		for(int i=0; i<10;i++) {
			int randInt = (int)(Math.random()*range)+min;
			System.out.println(randInt);
		}
		
		double nilai1 = Math.sqrt(9);
		System.out.println(nilai1);
		
		double nilai2 = Math.pow(3,4);
		System.out.println(nilai2);
		
		Random random = new Random();
		for(int i=0;i<10;i++) {
			int randomNumber = random.nextInt(100);
			System.out.println(randomNumber);
		}
	}
	
}
