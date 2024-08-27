package returnstatement;

public class Factorial2 {
    public static void main(String[] args) {
        int result=m1(5);
        System.out.println(result);
    }
    public static int m1(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
}
