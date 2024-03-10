public class stringse {
  public static void main(String args[]) {
    try {
      // code that may raise exception
      int data = 100 / 0;
    }
    // rest code of the program
    finally {
      System.out.println("rest of the code...");

    }
  }
}