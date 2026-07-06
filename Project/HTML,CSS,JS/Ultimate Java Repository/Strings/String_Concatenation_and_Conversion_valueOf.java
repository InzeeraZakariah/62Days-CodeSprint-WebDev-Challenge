// -- String Concatenation and Conversion using valueOf() -- //

class String_Concatenation_and_Conversion_valueOf {
    public static void main(String[] args) {
        int age = 9;
        
        // Concatenation using + operator
        System.out.println("He is " + age + " years old.");
        System.out.println("four: " + 3 + 3);   // Result: four: 33
        System.out.println("four: " + (3 + 3)); // Result: four: 6

        // Explicit Conversion from int to string using valueOf()
        int num = 30;
        String s = String.valueOf(num); // String.valueOf()
        System.out.println("String Value: " + s);
    }
}