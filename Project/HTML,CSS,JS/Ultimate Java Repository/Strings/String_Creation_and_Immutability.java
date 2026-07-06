// -- String Creation and Immutability -- //

class String_Creation_and_Immutability {
    public static void main(String[] args) {
        
        // -- String Creation -- //
        // 1. Using String Literals
        char[] ch = {'P','E','S'};
        // 2. Using 'new' keyword
        String s1 = new String(ch);
        // 3. Using String concatenation
        String s2 = "banana";

        // -- Immutability: replace() creates a NEW string -- //
        String result = s2.replace('a', 'o');

        System.out.println("Original: " + s2); // banana
        System.out.println("Replaced: " + result); // bonono
    }
}