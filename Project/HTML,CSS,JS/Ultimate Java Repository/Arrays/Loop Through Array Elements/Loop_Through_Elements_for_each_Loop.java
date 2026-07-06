// -- Loop through array elements using for-each loop -- //

class Loop_Through_Elements_for_each_Loop {
    public static void main(String[] args) {
        // Initializing String Array
        String[] strArray = {"Python", "Java", "C++", "C", "PHP"};

        // Loop through array elements using for-each loop
        for (String i : strArray) { // for (data_type variable : array_name)
            System.out.println(i);
        }
    }
}