import java.util.Scanner;

public class TableCreate {
    public static void main(String[] args) {
        Scanner Rohit= new Scanner(System.in);
        System.out.print("Enter the number for which you want to create table :");
        int num = Rohit.nextInt();
        
        for(int i=num; i<=num*10; i++){
            System.out.println(i);
            i=i+(num-1);
        }
}
}