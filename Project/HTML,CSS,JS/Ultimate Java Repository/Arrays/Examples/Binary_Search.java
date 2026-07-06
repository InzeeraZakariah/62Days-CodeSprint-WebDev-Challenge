// -- Arrays Helper: Binary Search -- //

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array before binary search
        Arrays.sort(array);

        System.out.print("Enter the key to search: ");
        int key = sc.nextInt();
        
        System.out.println();

        // Perform binary search
        int index = Arrays.binarySearch(array, key);
        if (index >= 0) {
            System.out.println(key + " found at index: " + index);
        } else {
            System.out.println(key + " not found in the array.");
        }

        sc.close();
    }
}
