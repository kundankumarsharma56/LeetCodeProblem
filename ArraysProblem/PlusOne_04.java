package ArraysProblem;

import java.util.Scanner;

public class PlusOne_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int sizeOfArray = sc.nextInt();

        System.out.println("Enter the elements of arrays: ");
        int elements [] = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            elements[i] = sc.nextInt();
        }

        pluseOne(elements);
        for (int x : elements)
            System.out.print(x+",");
    }

    private static int[] pluseOne(int[] elements) {
        for(int i = elements.length - 1; i >= 0; i--){
            if(elements[i] == 9){
                elements[i] = 0;
            }else{
                elements[i]++;
                return elements;
            }
        }
        elements = new int [elements.length + 1];
        elements[0] = 1;
        return elements;
    }
}
