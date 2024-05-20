import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c,Triangle;
		System.out.println("Enter the angle value of a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Triangle=a+b+c;
		if(Triangle==180) {
			System.out.println("Triangle is valid");
		}else {
			System.out.println("Triangle is not valid");
		}

	}

}
