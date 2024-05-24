package com.Pyramid;

public class ComplexPyramid {


	public static void main(String[] args) {
		
		char i,j;
		for(i='E'; i>='A'; i--) {
			for(j='A'; j<=i; j++) {
				
				System.out.print(j);
			}
			for(j=1; j<=1; j++) {
			System.out.print("*");
			
			}
			for(j='E'; j>='A'; j--) {
				
			System.out.print(j); 
			}
			for(j='A'; j<='E'; j++) {
				System.out.print(" ");
				}
			System.out.println();
		}

	}

}
