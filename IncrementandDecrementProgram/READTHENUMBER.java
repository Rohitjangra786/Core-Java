package IncrementandDecrementProgram;
import java.util.Scanner;

public class READTHENUMBER {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the NUmber: ");
            int num=sc.nextInt();

            if (num<9 && num >0) {
                System.out.println("31 Days");
            } else if (num==2){
                System.out.println("28 or 29 Days");
            }
            else if (num==4 || num==9){
                System.out.println("30 Days");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
class characterisvowel3 {
    public static void main(String[] args) {
        try (//char sq= a,e,i,o,u;
        Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the char: ");
            char ss=s.nextLine().charAt(0);

            if (ss=='a' || ss=='e'|| ss=='i'|| ss=='o'||ss=='u') {
                System.out.println("Vowel");
            }

            else if (ss>96 && ss <123){
                    System.out.println("Consonent");
                }
            else{
                    System.out.println("invalid");
                }
        }
            
        
        
    }
}