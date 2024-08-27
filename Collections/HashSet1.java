package Collections;
import java.util.HashSet;


public class HashSet1 {
    public static void main(String[] args) {

        //It doesn't follows insertion order and duplicates are not allowed..
        HashSet a=new HashSet();

        a.add(1);
        a.add(3);
        a.add("Rohit");
        a.add('c');
        a.add(2);
        a.add(3.4f);
        a.add(3);
        a.add("Rohit");

        System.out.println(a);

        System.out.println(a.size());

        a.remove("Rohit");
        System.out.println(a.size());
        System.out.println(a);
        
    }
    
}
