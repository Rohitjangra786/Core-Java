package IncrementandDecrementProgram;
public class Second2 {
    public static void main(String[] args) {
        int a,b,c,d;
        a=10;
        b=20;
        c=3;
        d=--a + --b + b++ -c -a + ++a -c++ - a++;

        System.out.println(d);
    }
}
