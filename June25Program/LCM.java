package June25Program;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int a= sc.nextInt();
        System.out.println("Enter the 2nd Number : ");
        int b= sc.nextInt();

        int lcm1=a>b?a:b;

        while (true) {
            if (lcm1%a==0 && lcm1%b==0) { 
                break;
                }
                lcm1++;
            
        }
        System.out.println(lcm1);
    }
}
