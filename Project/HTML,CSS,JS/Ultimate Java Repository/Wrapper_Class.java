//-- Wrapper Class --//

class Wrapper_Class {
    public static void main(String args[]) {
        int a = 10;
        Integer obj = Integer.valueOf(a); // Boxing
        System.out.println(obj); // Output: 10

        int b = obj.intValue();
        System.out.println(b); // Output: 10
    }
}
