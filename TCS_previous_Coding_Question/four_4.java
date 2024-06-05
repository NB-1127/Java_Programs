import java.util.*;

public class four_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String path;
        System.out.println("Enter no ");
        n = sc.nextInt();
        System.out.println("Enter path ");
        path = sc.next();

        int result = countSteps(n, path);
        System.out.println(result);
    }

    public static int countSteps(int n, String path) {
        int vallyc = 0;
        int steps_level = 0;

        for (int i = 0; i < path.length(); i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                steps_level++;
            } else {
                steps_level--;
            }
            if (step == 'U' && steps_level == 0) {
                vallyc++;
            }
        }
        return vallyc;
    }
}
