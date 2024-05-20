import java.util.Scanner;

public class Cal_Marks {
    
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m,h,e,t,p;
		System.out.println("Enter marks of Marathi, Hindi, English :");
		m=sc.nextInt();
		h=sc.nextInt();
		e=sc.nextInt();
		t=m+h+e;
		p=t/3;
		if(p>40) {
			System.out.println("Student is Pass");
			
		}else {
			System.out.println("Student is Fail");
		}
		
		

	}
}
