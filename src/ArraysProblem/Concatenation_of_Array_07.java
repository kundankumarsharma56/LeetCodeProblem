package ArraysProblem;

import java.util.*;

public class Concatenation_of_Array_07 {
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

        System.out.println(Arrays.toString(getConcatenation(sizeOfArray, arr)));

    }

    private static int[] getConcatenation(int size, int[] nums){
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < size; i++) {
            result[i] = nums[i];
            result[i+size] = nums[i];
        }
        return result;
    }
}
