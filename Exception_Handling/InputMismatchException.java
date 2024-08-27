package Exception_Handling;


import java.util.Scanner;

public class InputMismatchException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      int num = scanner.nextInt();
      System.out.println("");
    }
}
