package com.loop;

import java.util.Scanner;

public class UserInputFact {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		int fact=1;
		System.out.println("Enter a Number");
		n=sc.nextInt();
		
		for(int i=1;i<=n; i++) {
			
			fact=fact*i;
			
		}
		System.out.println(fact);
	}

}
