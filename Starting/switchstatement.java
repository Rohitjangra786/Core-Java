import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        try (Scanner Rohit = new Scanner(System.in)) {
            int day = Rohit.nextInt(); // taking the day as the input.

            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thrusday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Satursday");
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }
        }


        

}
}
