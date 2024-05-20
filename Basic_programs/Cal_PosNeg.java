import java.util.Scanner;

public class Cal_PosNeg {
    
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter  a No");
		n=sc.nextInt();
		
		if(n>0)
			System.out.println("Positive No");
		else if(n<0)
			System.out.println("Negative No");
		else
			System.out.println("Zero");

	}
}
