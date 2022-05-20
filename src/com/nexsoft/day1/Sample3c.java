package com.nexsoft.day1;

import java.util.Calendar;
import java.util.Scanner;

public class Sample3c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
//		Calendar kalender = Calendar.getInstance();
//		int tahun_skrg = kalender.get(Calendar.YEAR);
//		System.out.println(tahun_skrg);
//		
//		System.out.println("Masukkan tahun mulai bekerja");
//		int tahun_mulai = input.nextInt();
//		
//		int lama = tahun_skrg - tahun_mulai;
//		System.out.println("Lama bekerja = "+lama);
//		
		double nilai = input.nextDouble();
		char predikat = input.next().charAt(0);
		
		System.out.println(nilai);
		System.out.println(predikat);
		
	}
}
