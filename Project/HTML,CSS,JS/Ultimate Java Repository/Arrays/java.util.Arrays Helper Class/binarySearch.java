// -- Arrays Helper: binarySearch() -- //

import java.util.Arrays;

class binarySearch {
    public static void main(String[] args) {
        // 1. Initialize an unsorted array
        int[] numbers = { 40, 10, 30, 20, 50 };

        // 2. Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 3. Search for an element that exists
        int key = 30;
        int result = Arrays.binarySearch(numbers, key);
        
        if (result >= 0) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        // 4. Search for an element that does NOT exist
        int missingKey = 25;
        int missingResult = Arrays.binarySearch(numbers, missingKey);
        System.out.println("Result for missing element (25): " + missingResult);
    }
}
