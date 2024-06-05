
import java.util.*;
public class seven_7 {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt(); 
        int pro=1;//product value of initially
    
        int sum=0; /// sum is initially 0

        String s= Integer.toString(n);// it converts String into integers

        for(int i=0; i<s.length(); i++){

            char c= s.charAt(i);
            pro=pro*Character.getNumericValue(c);// Convert char to int
            sum=sum+Character.getNumericValue(c);

        }
            System.out.println("Actual price of product is: "+Math.abs(pro-sum));
            // Math.abs is gives the absolute value of the numbereither it is negative or positive  
    }
    
}
