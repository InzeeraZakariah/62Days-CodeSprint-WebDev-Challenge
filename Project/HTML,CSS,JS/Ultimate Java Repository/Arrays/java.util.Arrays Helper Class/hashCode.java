// -- Arrays Helper: hashCode() -- //
  // The hash code of an array is generated based on its contents, not its reference.
  // The Arrays.hashCode() method computes a hash code for the array based on its elements.

import java.util.Arrays;

class hashCode {
    public static void main(String[] args) {
        int intArr[] = { 10, 20, 11, 21, 31 };

        // Arrays.hashCode(arr) - Generating a hash code based on array contents
        System.out.println("Integer Array HashCode: " + Arrays.hashCode(intArr));
    }
}
