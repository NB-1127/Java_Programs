import java.util.*;
public class eight_8 {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        int sum=0;

        for(char c: n.toCharArray()){
            int digit= Character.getNumericValue(c);// Convert char to int
            sum= sum+digit;

        }
        if(sum % 3==0){
            System.out.println("yes it is divisible");
        }else{
            System.out.println("not divisible");
        }
    }
    
}
