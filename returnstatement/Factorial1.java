package returnstatement;

public class Factorial1 {
    public static void main(String[] args) {
        m1(5);
    }
    public static void m1(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
