package com.loop;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;int sum=0;
		System.out.println("Enter a Decimal Number");
		n=sc.nextInt();
		int i=1;
		while(n>0) {
			int d=n%8;
			sum=sum+d*i;
			n=n/8;
			i=i*10;
		}
		System.out.println("octal Number " +sum);

	}

}
