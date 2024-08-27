package June25Program;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want check for the palindrome : ");
        int num = sc.nextInt();
        int num2=num;
        int rev=0;

        while (num!=0) {
            int rem= num%10;
            rev = rev *10 + rem;
            num = num/10;
        }
        System.out.println(rev);
        
        if (rev==num2) {
            System.out.println("Number is Palindrome ");
        } else {
            System.out.println("Number is Not panindrome");
        }
    }
}
