package ArraysProblem;

import java.util.Scanner;

public class Richest_Customer_Wealth_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int sizeOfArray = scanner.nextInt();

        System.out.println("Enter the Elements of Array: ");
        int [][]arr = new int[sizeOfArray][sizeOfArray];

        // Taking input from user
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Richest_Customer_Wealth(sizeOfArray, arr));
    }

    private static int Richest_Customer_Wealth(int sizeOfArray, int[][] arr) {
        int maxWelth = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                 sum += arr[i][j];
            }
            if (sum > maxWelth){
                maxWelth = sum;
            }
        }
        return maxWelth;
    }
}
