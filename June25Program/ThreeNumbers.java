package June25Program;

//PRINTING THE THREE NUMBER IS EVEN OR ODD AND PERFORM THE OPERATION ON THE NUMBERS.

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
          System.out.println("Enter three numbers: ");
          int a = s.nextInt();
          int b = s.nextInt();
          int c = s.nextInt();
          if (a%2==0 && c%2==0 && b%2==0  ) {
                  System.out.println("All Given Number are Even and their Multiplication is :"+a*b*c);
          }
          else if (a%2==0 && b%2==0 || a%2==0 && c%2==0 || c%2==0 && b%2==0){
              if (a%2==0 && b%2==0) {
                  System.out.println("There are Two Number is Even a & b and Their Addition is : "+(a+b));
                } else if (a%2==0 && c%2==0) {
                  System.out.println("There are Two Number is Even a & c and Their Addition is : "+(a+c));
                } else if (c%2==0 && b%2==0) {
                  System.out.println("There are Two Number is Even c & b and Their Addition is : "+(c+b));
                }
          }   
          else if (a%2==0 || b%2==0 || c%2==0 ) {
              if (a % 2 == 0) {
                  System.out.println("There are only one number is Even i.e a : "+a);
                } else if (b % 2 == 0) {
                  System.out.println("There are only one number is Even i.e b : "+b);
                } else if (c % 2 == 0) {
                  System.out.println("There are only one number is Even i.e c : "+c);
                }
          } 
          else{
              System.out.println("Invalid Input (Give atleast one Even Number)");
          }
        }
        
    }
}
