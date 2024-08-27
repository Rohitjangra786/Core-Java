package June25Program;
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=s.nextInt();
        int count=0;
        
        if (a==2) {
            System.out.println(a+" is prime Number");
            
        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {   
                    count++;}}
                
        if(count==2)
        {
            System.out.println(a+ " is prime Number");
        }
            else{
                    System.out.println(a+ " is not prime Number");
                }
            }
                
            
            
        }
            
}
