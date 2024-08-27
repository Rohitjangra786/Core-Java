package Collections;
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque a=new ArrayDeque();

        a.add(1);
        a.add(3);
        a.add("Rohit");
        a.add('c');
        a.add(3.4f);
        a.add(3);
        a.add("Rohit");

        System.out.println(a);
        a.remove("Rohit");
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.isEmpty());

        
    }
    
}
