import java.util.*;
public class ten_10 {

    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        int ans=1;
        for (int i = 1; i <=n; i++) {
            ans=ans*i;
        }
        return ans;
    }

    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        int su = 0;
        for (char c : String.valueOf(n).toCharArray()) {
        su += fact(Character.getNumericValue(c));
}
        if (su == n) {
        System.out.println("Yes");
        } else {
        System.out.println("No");
}
    }
    
}
