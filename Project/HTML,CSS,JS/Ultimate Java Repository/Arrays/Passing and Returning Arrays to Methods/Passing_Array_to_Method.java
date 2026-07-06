// -- Passing Array to Method -- //

public class Passing_Array_to_Method {
    
    // Method
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max; 
    }

    // MAIN Method Class
    public static void main(String[] args) {
        int myArray[] = {45, 33, 98, 65, 76, 43, 99, 23, 68};
        
        // Passing the array 'myArray' to the method
        int maxNumber = findMax(myArray);
        
        System.out.println("The max number of array is: " + maxNumber); 
    } 
}
