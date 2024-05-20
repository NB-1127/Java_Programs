import java.util.Scanner;

public class Swap_Num {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a Number:");
        a= sc.nextInt();
        b= sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("After Wapping numbers \n a=: "+ a +"\n b= "+ b);
    }
}
