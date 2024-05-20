import java.util.Scanner;

public class Mini_Num {
    
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		
		System.out.println("Enter the two number:");
		int a=in.nextInt();
		int b=in.nextInt();
		
		int min=(a<b)? a : b;
		

		System.out.println(min);
	}
}
