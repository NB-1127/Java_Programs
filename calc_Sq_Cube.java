import java.util.Scanner;

public class calc_Sq_Cube {
	public static void main(String[]args) {
		Scanner in =new Scanner(System.in);
		
		/*By using Conditional Operater
		 * int ans= (n > 0)? n*n :n*n*n ;
		 * one line code
		*/
		
		System.out.println("Enter a number:");
		int n=in.nextInt();
		int sq=n*n;
		
		int cube=n*n*n;
		
		System.out.println("Square:"+sq );
		System.out.print("Cube:"+cube);
		
		
	}

}
