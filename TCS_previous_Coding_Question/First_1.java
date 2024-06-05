import java.util.Scanner;
public class First_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A ; 
        int L;int x, y;
        System.out.println("Enter a Total no of Animals");
        A=sc.nextInt();
        System.out.println("Enter a total no of legs");
        L=sc.nextInt();

        
        y=(L-2*A)/2;
        // total animals with legs 4

        x= A-y;
        // total animals with legs 2

        System.out.println("ttal no.Animals in two legs are "+ x);
        System.out.println("ttal no.Animals in four legs are "+ y);
    }
}