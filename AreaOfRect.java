import java.util.Scanner;

// Formula : Area Of Rectangle = length * breadth
public class AreaOfRect {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int l, b, area;
        System.out.println("Enter a Length and Breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        area= l* b;
        System.out.println("Area of Rectangle:" + area);
    }
}
