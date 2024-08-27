package returnstatement;

public class factorial3 {
    public static void main(String[] args) {
        int result =m1();
        System.out.println(result);
    }
    public static int m1(){
        int fact=1;
        int a=5;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;

    }
}
