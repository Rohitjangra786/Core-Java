package IncrementandDecrementProgram;
public class Fifth {
    public static void main(String[] args) {
        int a=11,b=22,c;
        c= a + b + a++ + b++ + ++a + ++b;

        System.out.println(c);
    }
}
