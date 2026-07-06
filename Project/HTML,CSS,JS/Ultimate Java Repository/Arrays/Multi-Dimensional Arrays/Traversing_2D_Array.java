// -- Traversing 2D Array -- //

class Traversing_2D_Array {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 1. Using standard for loop
        System.out.println("Using standard for loop:");
        for (int i = 0; i < matrix.length; i++) { // row
            for (int j = 0; j < matrix[i].length; j++) { // column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 2. Using for-each loop
        System.out.println("\nUsing for-each loop:");
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}