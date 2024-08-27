package returnstatement;

public class evenodd {
    public static void main(String[] args) {
        String s=m1(6);
        System.out.println(s);
    }
    public static String m1(int num){
        if(num%2==0){
            return "hy";
        }
        else{
            return "hello";
        }
    }
}
