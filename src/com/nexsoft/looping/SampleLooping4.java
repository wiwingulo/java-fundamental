package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		int x=0, n =5;
//		while(x<n) {
//			System.out.println(x);
//			x++;
//		}
//		
//		int y = 0;
//		do {
//			System.out.println(y);
//			y++;
//		
//		} while(y<n);
		
//		int angka;
//		System.out.println("Masukkan angka sesukanya : ");
//		angka=input.nextInt();
//		int sum = 0;
//		while(angka>=0) {
//			angka = input.nextInt();
//			sum += angka;
//		}
//		System.out.println("Jumlah "+sum);		
//		
		
		String jawab;
		boolean jawaban = true;
		int hitung=0;
		while(jawaban) {
			System.out.println("Apakah anda ingin close program");
			System.out.println("Jawab ya/tidak ?");
			jawab = input.nextLine();
				
			if(jawab.equalsIgnoreCase("ya")) {
				jawaban = false;
				System.out.println("Program berhenti");
			}	
			hitung++;
		}
		System.out.println("Hitung perulangan "+hitung);
}
	
}