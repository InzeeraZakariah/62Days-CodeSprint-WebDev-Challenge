// -- Arrays Helper: toString() and Equals() -- //

import java.util.Arrays;

class toString_and_Equals {
    public static void main(String[] args) {
        int Arr[] = { 10, 20, 11, 21, 31 };
        int Arr1[] = { 10, 11, 21 };

        // Arrays.toString(arr) - Printing array content directly
        System.out.println("Integer Array is: " + Arrays.toString(Arr));

        // Arrays.equals(arr1, arr2) - Comparing two arrays
        System.out.println("Arrays are equal: " + Arrays.equals(Arr, Arr1));
    }
}
