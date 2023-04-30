public class Client {

    /**
     * This method name and parameters must remain as-is
     */
    public static int add(int lhs, int rhs) {
        return -1;
    }
    /**
     * This method name and parameters must remain as-is
     */
    public static int divide(int num, int denom) {
        return -1;
    }
    /**
     * This method name and parameters must remain as-is
     */
    public static String echo(String message) {
        return "";
    }

    // Do not modify any code below this line
    // --------------------------------------
    String server = "localhost";
    public static final int PORT = 10314;

    public static void main(String... args) {
        // All of the code below this line must be uncommented
        // to be successfully graded.
        System.out.print("Testing... ");

        if (add(2, 4) == 6)
            System.out.print(".");
        else
            System.out.print("X");

        try {
            divide(1, 0);
            System.out.print("X");
        }
        catch (ArithmeticException x) {
            System.out.print(".");
        }

        if (echo("Hello").equals("You said Hello!"))
            System.out.print(".");
        else
            System.out.print("X");
        
        System.out.println(" Finished");
    }
}