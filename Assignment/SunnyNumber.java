import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number : ");
            int n = sc.nextInt();
            int m = n+1;
            for (int i = 1; i <= m; i++) {

            if (i*i==m) {
                System.out.println(n +" is Sunny Number");
                
                } 
                else{
                System.out.println(n +" is not Sunny Number");
                break;
                
                }
                
                
      }
        }
       
    }}

