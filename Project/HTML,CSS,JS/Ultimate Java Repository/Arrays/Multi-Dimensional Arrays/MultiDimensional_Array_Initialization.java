// -- Initialize Multi-Dimensional Array -- //

public class MultiDimensional_Array_Initialization {
    public static void main(String[] args) {
        
        // 1. Initializing with literal values
        int array1[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print elements of array1
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 2. Initializing with specific size (4 rows, 5 columns)
        int[][] array2 = new int[4][5];
        
        // Print elements of array2
        for (int a = 0; a < array2.length; a++) {
            for (int b = 0; b < array2[a].length; b++) {
                System.out.print(array2[a][b] + " ");
            }
            System.out.println();
        }
    }
}