

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double da ,hra,b,g ;
		System.out.println("Enter the basic salary");
		b=sc.nextDouble();
		if(b > 0) {
		da=b*10/100;
		hra=b*20/100;
		g=b+da+hra;
		System.out.println("DA "+da+"\nHRA"+hra+"\nGross salary is " + g);
		}else {
			System.out.println("Invalid Amount");
		}
}
}
