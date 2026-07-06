// -- Jagged Array --//

public class Jagged_Array {
    public static void main(String[] args) {
        // Declaration and initialization of jagged array
        int[][] jaggedArray = {
            {1, 3, 77},
            {2, 54},
            {106, 7, 18, 99}
        };
        
        // Looping through jagged array elements
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}