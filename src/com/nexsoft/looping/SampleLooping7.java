package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping7 {
	
	public static void main(String[] args) {
//		int angka1=0,angka2=1,angka3,i,jumlahDeret=10;    
//		 System.out.print(angka1+" "+angka2);	
//		    
//		 for(i=2;i<jumlahDeret;++i) 
//		 {    
//		  angka3=angka1+angka2;    
//		  System.out.print(" "+angka3);    
//		  angka1=angka2;    
//		  angka2=angka3;    
//		 }    
		
//		 int i = 1, jumlahDeret = 10, angka1 = 0, angka2= 1;
//	
//		    while (i <= jumlahDeret) {
//		      System.out.print(angka1 + ", ");
//
//		      int angka3 = angka1+ angka2;
//		      angka1 = angka2;
//		      angka2= angka3;
//
//		      i++;
//		    }
		
		Scanner input = new Scanner(System.in);
		   
		  System.out.print("Masukkan angka : ");
		  int num1 = input.nextInt();
		   
		  for (int i=0; i< 10; i++){
		   System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
		  }
	}
	
}
