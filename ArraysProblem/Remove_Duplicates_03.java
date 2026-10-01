package ArraysProblem;

import java.util.Scanner;

public class Remove_Duplicates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sizeOfArray = scanner.nextInt();

        System.out.println("Enter the elements of arrays: ");
        int arr[] = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(RemoveDuplicatesFromSortedArray(arr));
    }

    private static int RemoveDuplicatesFromSortedArray(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}
