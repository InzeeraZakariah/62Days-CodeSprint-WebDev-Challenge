//-- Calculate sum of 2 numbers --//

class Sum_Of_Numbers {
    int a = 7;
    int b = 10;
    void calcSum() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
    public static void main(String args[]) {
        Sum_Of_Numbers obj = new Sum_Of_Numbers();
        obj.calcSum(); // Output: Sum = 17
    }
}
