package com.nexsoft.decision;

import java.util.Calendar;
import java.util.Scanner;

public class SampleDecision2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//nilai A = 90-100
		//nilai B = 85 - 89
		//nilai C = 75 - 84
		//nilai D = < 75
		//nilai hanya dari 0-100
		
		
//		int a;
//		System.out.println("Masukkan nilai a = ");
//		a = input.nextInt();
//		
//		if(a>=90 && a<100) {
//			System.out.println("Nilai A");
//			
//		}
//		else if(a>=80 && a<89) {
//			System.out.println("Nilai B");
//		}
//		else if(a>=75 && a<84) {
//			System.out.println("Nilai C");
//		}		
//		else if (a<=75) {
//			System.out.println("Nilai D");
//		}else {
//			System.out.println("Nilai hanya boleh rentan 1-100");
//		}
		
//		int platNomor ;
//		System.out.println("Masukkan plat nomor");
//		platNomor = input.nextInt();
//		int tanggal;
//		System.out.println("Masukkan tanggal");
//		tanggal = input.nextInt();
//		
//		
//		if(platNomor%2==0 && tanggal%2==0){
//			System.out.println("Tidak melanggar, plat nomor genap dan tanggal genap boleh masuk ");
//		}
//		else if(platNomor%2==1 && tanggal%2==1) {
//			System.out.println("Tidak melanggar, plat nomor ganjil dan tanggaal ganjil boleh masul");
//		}
//		else {
//			System.out.println("Dilarang masuk");
//		}
		
		//diatas 17 dibawah 50
		
//		int usia,beratBadan;
//		System.out.println("Masukkan usia  = ");
//		usia = input.nextInt();
//		System.out.println("Masukkan berat badan = ");
//		beratBadan = input.nextInt();
//		
//		if(usia>=17 && usia<50) {
//			if (beratBadan > 55){
//			System.out.println("Tidak boleh mendonor dikarenakan usia kurang");
//		} else {
//			if (beratBadan < 55){
//				System.out.println("Tidak boleh mendonor dikarenakan bb kurang");
//			}
//		else {
//			System.out.println("Silahkan mendonor");
//		}
//		}
//		}
//		
//		int usia, bb;
//		System.out.println("Masukkan usia: ");
//		usia = input.nextInt();
//		System.out.println("Masukkan berat badan: ");
//		bb = input.nextInt();
//		if (usia >= 17 && usia <= 50) {
//			if (bb >= 55) {
//				System.out.println("Boleh mendonor, usia dan bb sesuai");
//			} else {
//				System.out.println("Tidak boleh mendonor, usia sesuai dan bb tidak sesuai");
//			}
//		} else {
//			if (bb >= 55) {
//				System.out.println("Tidak boleh mendonor, usia tidak sesuai dan bb sesuai");
//			} else {
//				System.out.println("Tidak boleh mendonor, usia tidak sesuai dan bb tidak sesuai");
//			}
//		}
		
		int jumlah, kelas, total_bayar;
		char dokter;
		System.out.println("Masukkan jumlah hari: ");
		jumlah = input.nextInt();
		System.out.println("Masukkan kelas: ");
		kelas = input.nextInt();
		System.out.println("Masukkan dokter: ");
		dokter = input.next().charAt(0);
		
		if (kelas == 1 && dokter == 'A') {
			System.out.printf("Total bayar = %d", (jumlah*100000)+1000000);
		} else if (kelas == 1 && dokter == 'B') {
			System.out.printf("Total bayar = %d", (jumlah*100000)+2000000);
		} else if (kelas == 2 && dokter == 'A') {
			System.out.printf("Total bayar = %d", (jumlah*50000)+1000000);
		} else if (kelas == 2 && dokter == 'B') {
			System.out.printf("Total bayar = %d", (jumlah*50000)+2000000);
		} else {
			System.out.println("Masukkan kelas (1 - 2) dan dokter (A, B) yang benar");
		}
			}
		
	}
