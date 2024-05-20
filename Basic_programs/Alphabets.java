import java.util.Scanner;

public class Alphabets {
 
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char ch;
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.println("Smaller letter");
			
		}else {
			System.out.println("Capital Letter");		}

	}

}
