package com.nexsoft.decision;

import java.util.Scanner;

public class SampleDecision3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
//		int hari = 8;
//		
//		switch (hari) {
//		case 1:
//			System.out.println("Senin");
//			break;
//		case 2:
//			System.out.println("Selasa");
//			break;
//		case 3:
//			System.out.println("Rabu");
//			break;
//		case 4:
//			System.out.println("Kamis");
//			break;
//		case 5:
//			System.out.println("Jumat");
//			break;
//		case 6:
//			System.out.println("Sabtu");
//			break;
//		case 7:
//			System.out.println("Minggu");
//			break;
//		default:
//			System.out.println("Tidak ada hari tersebut");
//			break;
//		}
//		
//		String browser;
//		System.out.println("Input nama browser : ");
//		browser = input.next();
//		String pilihBrowser = browser.toLowerCase();
//		
//		switch (pilihBrowser) {
//		case "firefox":
//			System.out.println("Open Firefox");
//			break;
//		case "chrome":
//			System.out.println("Open Chrome");
//			break;
//			
//		default:
//			System.out.println("Tidak ada browser lain");
//			break;
//		}
//		
//		char huruf = 'A';
//		switch (huruf) {
//		case 'A':
//			System.out.println("Huruf vokal");
//			break;
//		case 'I':
//			System.out.println("Huruf vokal");
//			break;
//		case 'U':
//			System.out.println("Huruf vokal");
//			break;
//		case 'E':
//			System.out.println("Huruf vokal");
//			break;
//		case '0':
//			System.out.println("Huruf vokal");
//			break;
//
//		default:
//			System.out.println("Huruf konsonan");
//			break;
//		}
		
//		int angka;
//		System.out.println("Rumus luas bangun datar : ");
//		System.out.println("1. Rumus Persegi ");
//		System.out.println("2. Rumus Persegi Panjang ");
//		System.out.println("3. Rumus Segitiga ");
//		System.out.println("Masukkan 1-3");
//		System.out.println("Masukkan pilihan : ");
//		angka = input.nextInt();	
//		
//		switch (angka) {
//		case 1:
//			int s,rper;
//			System.out.println("Masukkan sisi : ");
//			s = input.nextInt();
//			rper = s*s;
//			System.out.println("Hasil " + rper);
//			break;
//		case 2:
//			int x,y,rperpan;
//			System.out.println("Masukkan panjang : ");
//			x = input.nextInt();
//			System.out.println("Masukkan lebar");
//			y = input.nextInt();	
//			rperpan = x*y;
//			System.out.println("Hasil :  "+rperpan);
//			break;
//		case 3:
//			int c,d,rpersi;
//			System.out.println("Masukkan alas : ");
//			c = input.nextInt();
//			System.out.println("Masukkan tinggi : ");
//			d = input.nextInt();
//			rpersi = c*d/2;	
//			System.out.println("Rumus segitiga " + rpersi);
//			break;
//		default:
//			System.out.println("Tidak ada pilihan");
//			break;
//		}
//	
//		String kelas;
//		System.out.println("Masukkan nama kelas : ");
//		kelas = input.next();
//		
//		int jam;
//		System.out.println("Masukkan jam : ");
//		jam = input.nextInt();
//		
//		switch (kelas) {
//		case "1A":
//		
//			if(jam==9) {
//				System.out.println("Statistik");
//			}
//			else if(jam==10) {
//				System.out.println("Java");
//			} 
//			else {
//				System.out.println("Tidak ada jadwal");
//			}
//			break;
//		case "1B":
//			if(jam==9) {
//				System.out.println("Bahasa Indo");
//			}
//			else if(jam==10) {
//				System.out.println("Prak Java");
//			}	else {
//				System.out.println("Tidak ada jadwal");
//			}
//			break;
//
//		default:
//			System.out.println("Tidak ada kelas");
//			break;
//		}
//		
		
//		String kelas, jam;
//		System.out.print("Input kelas : ");
//		kelas = input.next();
//		kelas = kelas.toUpperCase();
//		
//		switch (kelas) {
//		case "1A":
//			System.out.print("Masukkan Jam : ");
//			jam = input.next();
//			switch (jam) {
//			case "9":
//				System.out.print("Statistik");
//				break;
//			case "10":
//				System.out.print("Pemrograman Java");
//				break;
//			default:
//				System.out.println("Tidak ada kegiatan di jam tersebut");
//				break;
//			}
//			break;
//		case "1B":
//			System.out.print("Masukkan Jam : ");
//			jam = input.next();
//			switch (jam) {
//			case "9":
//				System.out.print("Bahasa Indonesia");
//				break;
//			case "10":
//				System.out.print("Praktikum Java");
//				break;
//			default:
//				System.out.println("Tidak ada kegiatan di jam tersebut");
//				break;
//			}
//			break;
//		default:
//			System.out.println("Tidak ada kelas tersebut");
//			break;
//		}
		
		boolean sim = true;
		
		if(sim == true) {
			System.out.println("Tidak ditilang");
		}
		else {
			System.out.println("Ditilang");
		}
	}
}
