import java.util.Scanner;

public class Calc_Age {
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,s,a;
		System.out.println("Enter the age of Ram,Sham,Ajay");
		r=sc.nextInt();
		s=sc.nextInt();
		a=sc.nextInt();
        
		if(r<s && r<a)
			System.out.println("Younger is Ram");
		else if(s<r && s<a)
		System.out.println("Younger is Sham");
		else
			System.out.println("Younger is Ajay");
	}
}
