import java.util.Arrays;

public class Nine_9 {

    public static void main(String[] args){

        int n= 10;
         int k=3;

         int[] arr={1,2,3,4,5,6,7,8,9,10};
         
         int ans = Integer.MAX_VALUE;

         for (int i = 0; i < n; i++) {
            if(i+k+1< n){

                int[] sub=Arrays.copyOfRange(arr,i,i+k+1);

                int mi=Arrays.stream(sub).max().getAsInt();
                ans=Math.min(ans, mi);
            }
            
         }
         System.out.println(ans);
    }
    
}
