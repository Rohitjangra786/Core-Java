package Collections;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        
        //It follows insertion order
        Stack a=new Stack();

        a.add(1);
        a.add(300.78);
        a.add("Rohit");
        a.add('c');
        a.add(3.4f);
        a.add(3);

        System.out.println(a);
    }
}
