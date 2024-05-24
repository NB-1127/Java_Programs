package com.Pyramid;

public class StarPyramid {

	public static void main(String[] args) {
		
		int n;
		PatternStar(5);
		PatternStar1(5);
	}
	static void PatternStar(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void PatternStar1(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=i-1; j>=1; j-- ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=i-1; j>=1; j-- ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
