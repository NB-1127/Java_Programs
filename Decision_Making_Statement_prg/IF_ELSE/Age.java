import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r,s,a;
		System.out.println("Enter the age of Ram, Sham and Ajay");
		r=sc.nextInt();
		s=sc.nextInt();
		a=sc.nextInt();
		if(r<s && r<a)
			System.out.println("Ram is Younger");
		else if(s<r && s<a)
			System.out.println("Sham is Younger");
		else
			System.out.println("Ajay is Younger");
	}

}
