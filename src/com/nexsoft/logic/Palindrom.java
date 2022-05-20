package com.nexsoft.logic;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
	
		
	//22022022
	new Palindrom().palindrome("kasur rusak");
	new Palindrom().palindromReverse("22022023");
	}
	
	public void palindrome(String teks) {
		String poli = "";
		
		for(int i=teks.length();i>0;i--) {
			String huruf = teks.substring(i-1,i); //(10,11)
			poli += huruf;
			
		}
		if(teks.equals(poli)) {
			System.out.println(teks+" ini palindrom");
			
		}else {
			System.out.println(teks + " bukan palindrom");
		}
	}
	
	public void palindromReverse(String teks2) {
		StringBuffer reverse = new StringBuffer(teks2);
		reverse.reverse();
		if(teks2.equals(reverse)) {
			System.out.println(teks2 + " ini palindrom");
		}else {
			System.out.println(teks2 + " bukan palindrom");
		}
	}
		
//		String poli, huruf = ""; // Objects of String class  
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Masukkan poli : ");  
//	      poli = in.nextLine();   
//	      int length = poli.length();   
//	      for ( int i = length - 1; i >= 0; i-- )  
//	         huruf = huruf + poli.charAt(i);  
//	      if (poli.equals(huruf))  
//	         System.out.println(poli +" adalah palindrome.");  
//	      else  
//	         System.out.println(poli + " bukan palindrome.");   
//	   }  
//
		
		
		
		
	}



