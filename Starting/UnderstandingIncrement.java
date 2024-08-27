public class UnderstandingIncrement {
    public static void main(String[] args) {
      int a = 10;

      a=a++;
      int b = a++;  // b hold original value
        
      System.out.println(a); // This will print 11 (the incremented value)
      System.out.println(b);
    }
  }