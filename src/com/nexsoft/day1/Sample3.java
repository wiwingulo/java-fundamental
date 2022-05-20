package com.nexsoft.day1;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		
//	Biodata
	//nama, umur, asal, alamat
	Scanner input = new Scanner(System.in);
	
//	String nama,alamat;
//	int umur;
	
	
	
	System.out.println("Masukkan nama = ");
	String nama = input.nextLine();
	System.out.println("Masukkan alamat = ");	
	String alamat = input.nextLine();
	System.out.println("Masukkan umur = ");	
	int umur = input.nextInt();
	
	System.out.println("------------------------");	
	System.out.println("Masukkan nama = "+nama);
	System.out.println("Masukkan umur = "+umur);
	System.out.println("Masukkan alamat = "+alamat);
	
	}
	
	
}
