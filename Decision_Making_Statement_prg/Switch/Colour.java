import java.util.Scanner;

public class Colour {

	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		char ch;
		System.out.println("Enter the Color Code");
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'P':
			System.out.println("Pink");
			break;
		case 'B':
			System.out.println("Black");
			break;
		case 'W':
			System.out.println("White");
			break;
		case 'R':
			System.out.println("Red");
			break;
		default:
			System.out.println("Invalid code");
			}

	}

}



