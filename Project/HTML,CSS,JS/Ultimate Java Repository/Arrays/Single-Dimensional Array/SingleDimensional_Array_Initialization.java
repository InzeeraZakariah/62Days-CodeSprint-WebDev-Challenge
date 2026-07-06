// -- Initialize Single Dimensional Array -- //

class SingleDimensional_Array_Initialization {
    public static void main(String[] args) {
        
        // Declaration and Instantiation
        int marks[];
        marks = new int[5];

        // Initialization
        marks[0] = 56;
        marks[1] = 98;
        marks[2] = 77;
        marks[3] = 89;
        marks[4] = 99;

        // Printing elements using a for loop
        System.out.println("Array Elements:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + ": " + marks[i]);
        }
    }
}