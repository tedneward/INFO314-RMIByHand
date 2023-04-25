public class UnitTest {
  public static void main(String... args) {
    System.out.print("Testing... ");

    if (Client.add(2, 4) == 6)
        System.out.print(".");
    else
        System.out.print("X");

    if (Client.add(2, -4) == -2)
        System.out.print(".");
    else
        System.out.print("X");

    try {
        if (Client.divide(20, 10) == 2)
          System.out.print(".");
        else
          System.out.print("X");
    }
    catch (ArithmeticException x) {
        System.out.print("X");
    }

    try {
        Client.divide(1, 0);
        System.out.print("X");
    }
    catch (ArithmeticException x) {
        System.out.print(".");
    }

    if (Client.echo("Hello").equals("You said Hello!"))
        System.out.print(".");
    else
        System.out.print("X");

    if (Client.echo("Flibbity-floog").equals("You said Flibbity-floog!"))
        System.out.print(".");
    else
        System.out.print("X");

    System.out.println(" Finished");
  }
}