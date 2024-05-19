import java.util.Scanner;

public class Cal_Bonus {
    
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ba , e,B; // ba= basic salary, e= Experience  year, B= Bonus
		System.out.println("Enter a basic Salary and Experience of year");
		ba=sc.nextInt();
		e=sc.nextInt();
		if(e>=0 && e<=5) {
			B=ba/2*100;
			System.out.println("Bonus will increases 2%"+B);
		}
		else if(e>=6 && e<=10) {
			B=ba/5*100;
			System.out.println("Bonus will increases 5%"+B);
			
		}else if(e>10) {
			B=ba/10*100;
			System.out.println("Bonus will increases %"+B);
		}
		else {
			System.out.println("Bonus will not Increases");
		}

	}
}
