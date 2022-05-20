package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String password = "nexsoft",inputPassword;
		int maxInput = 3;
		
		int angka = 0;
		boolean login = true;
		
		do {
			System.out.println("Masukkan password : ");
			inputPassword = input.nextLine();
			
			if(inputPassword.equalsIgnoreCase(password)) {
				System.out.println("Login berhasil!");
				break;
			}else if(!inputPassword.equalsIgnoreCase(password)) {
				angka += 1;
				System.out.println("Login tidak berhasil");
				if(angka == maxInput) {
					System.out.println("Sudah "+ angka + " percobaan");
					login = false;
				}
			}
		} while(login);
		

	}
		
}

