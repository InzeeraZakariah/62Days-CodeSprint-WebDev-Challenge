// -- Access Modifiers -- //

// Access Modifiers inside the class
class Access_Modifiers_Inside_Class {

    public int publicVar = 10;
    protected int proVar = 20;
    private int privateVar = 30;
    int defVar = 40;

    // Getter for private variable
    public int getPrivateVar() {
        return privateVar;
    }

    public void showData() {
        System.out.println("Access Modifiers Inside Class:");
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Protected Variable: " + proVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Default Variable: " + defVar);
    }
}

// Access Modifiers from Main Class
public class Access_Modifiers {

    public static void main(String[] args) {
        Access_Modifiers_Inside_Class obj =
                new Access_Modifiers_Inside_Class();

        System.out.println("Access Modifiers From Main Class:");
        System.out.println("Public Variable: " + obj.publicVar);
        System.out.println("Protected Variable: " + obj.proVar);
        System.out.println("Private Variable: " + obj.getPrivateVar()); // Access private variable using getter
        System.out.println("Default Variable: " + obj.defVar);

        System.out.println();

        obj.showData();
    }
}