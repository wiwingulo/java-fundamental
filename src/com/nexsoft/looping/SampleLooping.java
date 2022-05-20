package com.nexsoft.looping;

public class SampleLooping {
	
	public static void main(String[] args) {
		
//		System.out.println("nexsoft");
//		System.out.println("nexsoft");
//		System.out.println("nexsoft");
//		System.out.println("nexsoft");
//		System.out.println("nexsoft");

		for(int i=1;i<10;i++) {
			System.out.println(i + ". Nexsoft");
		}
		
		for(int i=1; i<=10;i=i+2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=10;i>=1;i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		String nama = "Nexsoft";
		for(int i=1;i<=nama.length();i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int errorLogin = 3;
		for(int i=1;i<=errorLogin;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		String motor[] = {"Suzuki","Honda","Yamaha"};
		System.out.println(motor[0]);
		for(String i : motor) {
			System.out.println(i);
		}
	}

}
