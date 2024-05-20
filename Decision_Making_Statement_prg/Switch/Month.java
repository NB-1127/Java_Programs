import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("Enter the month no");
		num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("Invalid Value");
		}
	}

}
