package June25Program.twoDarray;

import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
      
            if (n==2) {
                System.out.println("prime number");
                
            } else {
                for (int i = 1; i <= n; i++) {
                    if(n%i==0){
                        count++;
                    }
                
            }
            if(count==2){
                System.out.println("prime number");
            }
            else{
                System.out.println("not prime number");
            }
   }
        }
}
}
