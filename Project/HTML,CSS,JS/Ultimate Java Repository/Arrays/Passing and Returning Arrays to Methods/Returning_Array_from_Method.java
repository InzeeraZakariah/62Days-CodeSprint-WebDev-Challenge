// -- Returning Array from Method -- //

public class Returning_Array_from_Method {
    
    // Method
    public static int[] method(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2; 
        }
        return arr;
    }

    // MAIN Method Class
    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5};
        
        // Receiving the returned array from the method
        int[] multiplyArr = method(myArray);
        
        System.out.println("Array multiplied by 2 is:");
        for(int i : multiplyArr) {
            System.out.print(i + " ");
        } 
    } 
}