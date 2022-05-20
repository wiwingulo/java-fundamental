package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping2 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		int nilaiAwal, nilaiAkhir;
//		 
//		System.out.println("Masukkan nilai awal : ");
//		nilaiAwal=input.nextInt();
//		System.out.println("Masukkan nilai akhir : ");
//		nilaiAkhir=input.nextInt();
//		
//		for(int i=nilaiAwal;i>=nilaiAkhir;i--){
//			System.out.println(i);
//		}
		
//		int batas = 3;
//		String motor[] = new String[batas];
//		System.out.println("Masukkan data motor : ");
//		for(int i=0;i<motor.length;i++) {
//			motor[i] = input.nextLine();
//		}
//		for(String i : motor) {
//			System.out.println(i);
//		}
		
//		int nilai = 4;
//		int angka[] = new int[nilai];
//		System.out.println("Masukkan nilai : ");
//		for(int i=0;i<angka.length;i++) {
//			angka[i] = input.nextInt();
//		}
//		int sum = 0;
//		for(int i : angka) {
//			System.out.println(i);
//			sum += i;
//		}
//		System.out.println("Jumlah nilai = "+sum);
//		
//		int nilai1 = 80, nilai2 = 80;
//		System.out.println("Sum = "+Integer.sum(nilai1, nilai2));
//		
	
		for(int i=1; i<=10;i++) {
			if(i%2==0) {
				System.out.print(" *");
				}
			else {
				System.out.print(" " + i);
				}
			}
		}
		
	
}
