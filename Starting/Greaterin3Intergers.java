public class Greaterin3Intergers {
    public static void main(String[] args) {
        int a=11,b=22,c=3;

        String d = (a > b) ? 
        (a > c) ? "A is larger" : "C is larger" : 
        (b > c) ? "B is larger" : "C is larger";


        System.out.println(d);
    }
}
