import java.util.Scanner;

/*A "Sunny" number based on the code logic provided is a number 
that is equal to the cube of its last digit.*/
public class Cal_Sunny_Num {
 
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,d,ans;
		System.out.println("Enter a No:");
		n=sc.nextInt(); 
		d=n%10;
		ans=d*d*d;
		if(n==ans)
			System.out.println("Number is Sunny");
		else
			System.out.println("Number is Not Sunny");
		

	}
}
