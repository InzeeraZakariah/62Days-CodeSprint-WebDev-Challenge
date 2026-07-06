//-- Auto Boxing and Unboxing --//

class Auto_Boxing_and_Auto_Unboxing {
    public static void main(String args[]) {
        int num = 2;

        // Auto-boxing: Converting primitive int to Integer object
        Integer num1 = num;
        System.out.println("Auto-boxing: " + num1); /* Output: 2 */

        // Auto-unboxing: Converting Integer object back to primitive int
        int num2 = num1;
        System.out.println("Auto-unboxing: " + num2); /* Output: 2 */
        
        String str = "11";
        // Auto-unboxing with parsing: Converting String to int
        int num3 = Integer.parseInt(str);
        System.out.println("String to int: " + num3); /* Output: 11 */
    }
}
