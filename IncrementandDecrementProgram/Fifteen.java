package IncrementandDecrementProgram;
public class Fifteen {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=20;
        c=30;

        String d = (a>b)?
            (b>c) ? "b is larger" : "c is larger" :
            (c>a) ? "c is larger" : "a is larger" ;

        System.out.println(d);
    }
}
