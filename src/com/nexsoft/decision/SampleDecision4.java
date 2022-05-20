package com.nexsoft.decision;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class SampleDecision4 {
	
	public static void main(String[] args) {
		double total = 100000;
		System.out.println(total);
		
		DecimalFormat formatRupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols simbolRupiah = new DecimalFormatSymbols();
		
		simbolRupiah.setCurrencySymbol("Rp. ");
		simbolRupiah.setMonetaryDecimalSeparator(',');
		simbolRupiah.setGroupingSeparator('.');
		
		formatRupiah.setDecimalFormatSymbols(simbolRupiah);
		System.out.println("Total belanja = " + formatRupiah.format(total));
		
//		NumberFormat formatDolar = NumberFormat.getCurrencyInstance(Locale.US);
//		System.out.println(formatDolar.format(total));
//		
//		NumberFormat formatJepang = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
//		System.out.println(formatJepang.format(total));
//	
		if(total >= 100000) {
			System.out.println("Mendapatkan kupon");
		}
		else {
			System.out.println("Belum mendapatkan kupon");
		}
		
		
		int x = 100;
		String a = "Nexsoft";
		System.out.printf("%-15s%03d\n",a,x);
		
		int c = 80;
		String d = "Nexsoft juara" , b = "Bootcamp";
		System.out.printf("%-15s%-15s%03d",d,b,c);
				
	}

}
