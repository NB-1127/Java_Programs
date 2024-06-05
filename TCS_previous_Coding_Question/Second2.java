import java.util.Scanner;

public class Second2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int m = scanner.nextInt(); // number of rows in the matrix
        System.out.println("Enter the number of columns:");
        int n = scanner.nextInt(); // number of columns in the matrix

        int[][] arr = new int[m][n];

        // Taking input of the array
        System.out.println("Enter the elements of the matrix (0 for no car, 1 for car):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxCars = 0; // maximum number of cars
        int ans = -1; // which row has the maximum number of cars

        for (int i = 0; i < m; i++) {
            int cnt = 0; // denotes how many cars are there in the current row

            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    cnt++;
                }
            }

            if (cnt > maxCars) { // Change to '>' from '>='
                maxCars = cnt;
                ans = i + 1;
            }
        }

        if (ans != -1) {
            System.out.println("Row " + ans + " has the maximum number of cars: " + maxCars);
        } else {
            System.out.println("No cars found in any row.");
        }

        scanner.close();
    }
}
