package returnstatement;

public class factorial {
    public static void main(String[] args) {
        fact();

    }
    public static void fact(){
        int fact=1;
        int a=5;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

