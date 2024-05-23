package com.loop;

import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,rem;
		System.out.println("Enter a Decimal Number");
		n=sc.nextInt();
		
		String str=""; 
	    char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	    
		while(n>0) {
			rem=n%16;
			str=hex[rem]+str;
			
			n=n/16;
			
		}
		System.out.println("Decimal To Hexadecimal " + str);

	}

}
