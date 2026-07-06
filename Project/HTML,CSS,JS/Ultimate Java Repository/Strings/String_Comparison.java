// -- String Comparison using equals() and == operator -- //

class String_Comparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        // Content equality using equals()
        System.out.println("equals(): " + s1.equals(s2)); // true
        
        // Reference equality using == operator
        System.out.println("== operator: " + (s1 == s2)); // false
    }
}