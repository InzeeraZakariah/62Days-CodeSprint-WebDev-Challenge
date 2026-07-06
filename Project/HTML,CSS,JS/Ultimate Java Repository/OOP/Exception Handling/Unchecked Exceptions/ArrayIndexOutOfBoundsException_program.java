// -- ArrayIndexOutOfBoundsException -- //

public class ArrayIndexOutOfBoundsException_program {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {10, 1, 2, 3, 5, 11};
      // Accessing an illegal index in the array
      System.out.println(myNumbers[10]);
    } 
    catch (ArrayIndexOutOfBoundsException e) {
      // Handles the generated exception type in the hierarchy
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    }
  }
}
