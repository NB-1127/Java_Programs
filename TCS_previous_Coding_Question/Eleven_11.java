import java.util.*;
public class Eleven_11 {
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
    
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        Set<Character> set1= new HashSet<>();
        Set<Character> set2= new HashSet<>();

        for(char c: s1.toCharArray()){
        set1.add(c);

    }

        for(char c: s2.toCharArray()){
        set2.add(c);
        }

        StringBuilder ans= new StringBuilder();

        for(char c: set1){
            if(set2.contains(c)){
                ans.append(c);
            }
        }

        System.out.println(ans);
    }
    
}
