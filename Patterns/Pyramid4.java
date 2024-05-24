package com.Pyramid;

public class Pyramid4 {

	public static void main(String[] args) {
		char i, j;
		for(i='E'; i>='A'; i--) {
			for( j='A'; j<=i; j++) {
				System.out.print(j);
			}
			for(j='D'; j>='A'; j--) {
				System.out.print("*");
			}
			for(j=i; j<='E'; j++) {
				System.out.print("*");
			}
			for( j='C'; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
