// -- Loop through array elements using for loop -- //

class Loop_Through_Elements_for_Loop {
    // MAIN Method
    public static void main(String[] args) {
        String[] array = {"Abc", "20", "BHF", "OU", "xyz"};
        int arrayLength = array.length;

        // Loop through array elements using for loop
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Element at index " + i + ": " + array[i]); // Print element
        }
    }
}