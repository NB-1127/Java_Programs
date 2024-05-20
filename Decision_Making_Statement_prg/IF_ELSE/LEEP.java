import java.util.Scanner;

public class LEEP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a Year");
		n=sc.nextInt();
		if(n%4==0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
	}

}
