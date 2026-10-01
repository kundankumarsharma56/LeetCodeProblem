package ArraysProblem;

import java.util.Scanner;

public class RemoveElement_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        System.out.print("Enter the val which is remove in elements: ");
        int val = scanner.nextInt();

        System.out.println("Enter the elements of array: ");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        removeElementsCount(arr,val);
    }

    private static void removeElementsCount(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != val){
                arr[count] = arr[i]; // if u missing this line then u getting error if u using LeetCode
                count++;
                System.out.print(arr[i]+", ");
            }
        }

        System.out.println("After removed elements: "+count);
    }
}
