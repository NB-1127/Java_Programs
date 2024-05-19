import java.util.Scanner;

// Volume Of Box : lenght* Breadth * Height
public class VolumeOfBox {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int l,b,h , volume;
        System.out.println("Enter value of length, breadth and height :");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        volume= l*b*h;
        System.out.println("Volume Of Box : "+ volume);
    }
    
}
