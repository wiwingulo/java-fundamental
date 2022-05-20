package com.nexsoft.looping;

import java.util.Scanner;

public class SampleLooping3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		for(int i=0;i<=3;i++) {
//			for(int j=1;j<5;j++) {
//				System.out.println(i + " " + j);
//			}
//		}
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("*");
//			} 
//			System.out.println();
//		}
		
//		for(int i=8;i>1;i--) {
//			for(int j=2;j<i;j++) {
//				if (j%2==0) {
//					System.out.print(j);
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}	
		int sum = 0;
		for(int i=20; i<=25;i++) {
			if(i %3==0 ) {
				System.out.print(" "+i);
				sum +=i;
			}else if (i %5==0) {
				System.out.print(" "+i);
				sum +=i;
			}else {
				System.out.print("");
			}
		}
		System.out.println("\n"
				+ "Sum = "+sum);
         
	}
}
