// -- Mutable Strings using StringBuffer and StringBuilder -- //
  // StringBuffer and StringBuilder are mutable classes in Java that allow you to modify the contents of a string without creating a new object.
  
class Mutable_Strings_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        // StringBuffer: Thread-safe
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer: " + sb);

        // StringBuilder: Faster, not thread-safe
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World");
        System.out.println("StringBuilder: " + sbuilder);
    }
}