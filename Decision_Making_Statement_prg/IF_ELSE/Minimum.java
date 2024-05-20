import java.util.*;
public class Minimum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value of 3 no:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a< b && a<c) {
			System.out.println("Minimum number is "+ a);
		
		}else if(b<a && b< c) {
			System.out.println("Minimum number is "+ b);
		}else if(c<a && c<b) {
			System.out.println("Minimum number is "+ c);
		}else {
			System.out.println("Not equal ");
		}
		
			
	}

}
