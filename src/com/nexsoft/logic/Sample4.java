package com.nexsoft.logic;

public class Sample4 {
 
	public static void main(String[] args) {
		
//		String teks1 = "nextsoft juara";
//		System.out.println(teks1.substring(11,12));
//		System.out.println(teks1.substring(1,4));
//		System.out.println(teks1.substring(1,4));
		String nim = "20180102003";
		
		System.out.println(nim.substring(0,4) + " Tahun masuk" );
		System.out.println(nim.substring(4,6) + " Fakultas");
		System.out.println(nim.substring(6,8) + " Prodi");
		System.out.println(nim.substring(8,11) + " no urut");
		
		String message = "Error : Username Password Invalid";
		if(message.contains("Invalid")) {
			System.out.println("Passed!");
		}else {
			System.out.println("Failed");
		}
		
		String nama1  = "Erik";
		String nama2 = "Erikaa";
		System.out.println(nama1.compareTo(nama2));
		
	}
}
