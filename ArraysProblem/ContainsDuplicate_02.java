package ArraysProblem;

import java.util.Scanner;

public class ContainsDuplicate_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sizeOfArray = scanner.nextInt();

        System.out.println("Enter the elements of arrays: ");
        int arr[] = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean flag = ContainsDuplicate(arr);
        if (flag)
            System.out.println("this is Contains Duplicate at leats twice: ");
        else
            System.out.println("this is not Contains Duplicate at leats twice: ");
    }

    private static boolean ContainsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
}
