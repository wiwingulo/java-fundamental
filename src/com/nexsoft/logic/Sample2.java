package com.nexsoft.logic;

import java.util.Scanner;

public class Sample2 {
	
	public static void main(String[] args) {
			

	Scanner input = new Scanner(System.in);
	
	double penghasilan;
	int gender;
	int status;

	System.out.println("Masukkan penghasilan : ");
	penghasilan = input.nextDouble();
	System.out.println("Masukkan jenis kelamin 0=Laki laki , 1 = Perempuan ");
	gender = input.nextInt();
	System.out.println("Masukkan status : ");
	status = input.nextInt();
	
	switch(gender){
	case 0:
		if(penghasilan>=7000000 && status == 1) {
			System.out.println("Pajak anda 10%");
		}else if(penghasilan>=7000000 && status ==2) {
			System.out.println("Pajak anda 5%");
		}else {
			System.out.println("Tidak wajib pajak");
		}
		break;
		
	case 1:
		if(penghasilan >=7000000 && status == 1) {
			System.out.println("Pajak anda 7%");
		}else if(penghasilan>=7000000 && status == 2) {
			System.out.println("Pajak anda 4%");
		}else {
			System.out.println("Tidak wajib pajak");
		}
		
	break;
	
	default:
		System.out.println("Tidak ada pajak");
		break;
	}
	}
}
