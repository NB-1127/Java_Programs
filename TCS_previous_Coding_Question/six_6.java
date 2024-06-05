import java.util.*;;
public class six_6 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int h1=sc.nextInt();
        int m1=sc.nextInt();
        int x=sc.nextInt();

        int n=numbesOfTimes(h,m);
        int target= numbesOfTimes(h1, m1);
        
        n=n+(x*60);

        System.out.println(Math.abs(target-n));

    }
    public static int numbesOfTimes(int h,int m){

        int ans=h*60+m;
    return ans;
    }
   
    
}
