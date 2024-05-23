package com.loop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;int sum=0;
		System.out.println("Enter a Number");
		n=sc.nextInt();
		int i=1;
		while(n>0) {
			int d=n%2;
			n=n/2;
			sum=sum+d*i;
			i=i*10;
			
		}
		System.out.println("Binary Number " +sum);

	}

}
