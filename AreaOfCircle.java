import java.util.Scanner;

//Formula  area Of cotrcle: Math.PI*radius* radius
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r, area;
        System.out.println("Enter a Radius:");
        r= sc.nextInt();
        area = Math.PI * r * r;
        System.out.println("Area Of Circle:" + area);
        
    }
}