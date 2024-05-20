import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double amt,d,p;
		System.out.println("Enter the Purchase amount");
		p=sc.nextDouble();
		
		if(p >=0 && p<=500) {
			d=p*5/100;
			amt=p-d;
			System.out.println("Discoun is 5% "+ d +"\nAmount pay by Customer " +amt);
			
		}else if(p>= 501 && p<=1001){
			d=p*7/100;
			amt=p-d;
			System.out.println("Discount is 7% "+ d+"\nAmount pay by Customer " +amt);
		}else if(p>=1001 && p<=5000) {
			d=p*10/100;
			amt=p-d;
			System.out.println("Discount is 10% "+ d+ "\nAmount pay by Customer " +amt);
		}else if(p> 5000) {
			d=p*15/100;
			amt=p-d;
			System.out.println("Discount is 15% "+ d +"\nAmount pay by Customer " +amt);
		}else {
			System.out.println("No Discount");
		}

	}

}
