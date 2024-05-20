import java.util.Scanner;

public class Swap_Without_3Variable {
 
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a,b;
		System.out.println("Enter a origibal value of  a& b");
			a=sc.nextInt();
			b=sc.nextInt();
			
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swapping:\na"+ a + "\nb:"+ b);

		
	}
}
