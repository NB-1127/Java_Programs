package com.loop;

import java.util.Scanner;

public class ChoiceOprationDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,sum,ch=0;
		do {
			System.out.println("Enter a 2 Number:");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Choice are\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				sum=a+b;
				System.out.println("Addition is "+sum);
				break;
			case 2:
				sum=a-b;
				System.out.println("Subtraction is "+sum);
				break;
			case 3:
				sum=a*b;
				System.out.println("Multiplication is "+sum);
				break;
			case 4:
				sum=a/b;
				System.out.println("Division is "+sum);
				break;
			default:
				break;
			}
		}while(ch>=1 && ch<=4);

	}

}
