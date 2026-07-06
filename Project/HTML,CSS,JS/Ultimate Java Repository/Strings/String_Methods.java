// -- String Methods -- //

class String_Methods {
    public static void main(String[] args) {

        // Creating string
        System.out.println("Creating string");
        String str = "Java Programming";
        System.out.println("Original string: " + str + "\n");

        System.out.println("--------------------------------\n");

        // str.length()
        System.out.println("str.length() Method");
        int length = str.length();
        System.out.println("Length of the string: " + length + "\n");

        System.out.println("--------------------------------\n");
    
        // str.charAt()
        System.out.println("str.charAt() Method");
        char ch = str.charAt(5);
        System.out.println("Character at index 5: " + ch + "\n");

        System.out.println("--------------------------------\n");

        // Comparison methods
        System.out.println("String Comparison Methods");

        System.out.println("str.equals() Method");
        String str2 = "java programming";
        boolean isEqual = str.equals(str2);
        System.out.println("'Java Programming' and 'java programming' are equal: " + isEqual + "\n");

        System.out.println("str.compareTo() Method");
        int compareResult = str.compareTo(str2);
        System.out.println("Comparison result: " + compareResult + "\n");

        System.out.println("--------------------------------\n");

        // Searching Methods
        System.out.println("String Searching Methods");

        System.out.println("str.contains() Method");
        System.out.println("String contains 'Programming': " + str.contains("Programming") + "\n");

        System.out.println("str.indexOf() Method");
        System.out.println("Index of 'Pro': " + str.indexOf("Pro") + "\n");

        System.out.println("str.lastIndexOf() Method");
        System.out.println("Last index of 'g': " + str.lastIndexOf("g") + "\n");

        System.out.println("str.startsWith() Method");
        System.out.println("String starts with 'Java': " + str.startsWith("Java") + "\n");

    }
}
