import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		char ch;
		System.out.println("Enter the Alphaber");
		ch=sc.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'A':
			System.out.println("Apple");
			break;
		case 'b':
		case 'B':
			System.out.println("Ball");
			break;
		case 'c':
		case 'C':
			System.out.println("Cat");
			break;
		default:
			System.out.println("Invalid value");
			}

	}

}
