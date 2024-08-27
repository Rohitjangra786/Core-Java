package IncrementandDecrementProgram;
public class Ninth {
    public static void main(String[] args) {
        int i=19,j=29,k;
        k= i-- - i++ + --j - ++j + --j - j-- + ++i - j++;

        System.out.println(k);
    }
}
