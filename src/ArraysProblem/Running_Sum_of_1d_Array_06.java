package ArraysProblem;

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum_of_1d_Array_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int sizeOfArray = scanner.nextInt();

        System.out.println("Enter the Elements of Array: ");
        int []arr = new int[sizeOfArray];

        // Taking input from user
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }

        // printing on Console
         System.out.println(Arrays.toString(Running_Sum(sizeOfArray, arr)));
    }


//    Implementation sum of array
    private static int[] Running_Sum(int sizeOfArray,int arr[]) {
        int sumofArray = 0;
        int [] result = new int[arr.length];
        for (int i = 0; i < sizeOfArray; i++) {
            sumofArray += arr[i];
            result[i] = sumofArray;
        }
        return result;
    }
}
