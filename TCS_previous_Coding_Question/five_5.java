import java.util.*;
import java.util.ArrayList;
public class five_5 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
       ArrayList<Integer> arr= new ArrayList<Integer>();
       System.out.println("Enter the integer");
       String[] arrinput= sc.nextLine().split(" ");
       for(String num : arrinput){
        // here to String to convert int
        arr.add(Integer.parseInt(num));
       }
       int k;
       System.out.println("Enter number of rotation");
       k=sc.nextInt();
       ArrayList<Integer> indices= new ArrayList<Integer>();
       System.out.println("Enter the space separed indices position");
       String[] indicesinput= sc.nextLine().split(" ");
       for(String nums : indicesinput){
        // here to String to convert int
        indices.add(Integer.parseInt(nums));
       }
       ArrayList<Integer> result=rightCircular(arr,k, indices) ;
       System.out.println(result);

    }
    
    public static ArrayList<Integer> rightCircular(ArrayList<Integer> arr, int k,ArrayList<Integer> indices ){

        int n=arr.size();

        for(int i=0; i< k; i++){
            rotationOne(arr,n);
        }
        ArrayList<Integer> result= new ArrayList<>();
        for(int index : indices){
            result.add(arr.get(index));

        }
        return result;
    }
        public static void rotationOne(ArrayList<Integer> arr, int n){
            int lastele=arr.get(n - 1);
            for(int i=n - 1; i>0; i--){
                arr.set(i, arr.get(i-1));
            }
            arr.set(0, lastele);
        }
     
}
