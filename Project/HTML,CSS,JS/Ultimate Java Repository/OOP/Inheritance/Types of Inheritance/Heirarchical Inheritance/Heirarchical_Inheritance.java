// -- Heirarchical Inheritance -- //

class BaseClass {
  int parentNum = 10;
}

class SubClass1 extends BaseClass {
  int childNum1 = 1;
}

class SubClass2 extends BaseClass {
  int childNum2 = 2;
}

class SubClass3 extends BaseClass {
  int childNum3 = 3;
}

public class Heirarchical_Inheritance {
  public static void main(String args[]) {
    SubClass1 obj1 = new SubClass1();
    SubClass2 obj2 = new SubClass2();
    SubClass3 obj3 = new SubClass3();

    System.out.println("Parent Number: " + obj1.parentNum);
    System.out.println("Child 1 Number: " + obj1.childNum1);
    System.out.println("Child 2 Number: " + obj2.childNum2);
    System.out.print("Child 3 Number: " + obj3.childNum3);
  }
}