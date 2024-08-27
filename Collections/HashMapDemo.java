package Collections;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer, String>h = new HashMap<Integer,String>();
        h.put(1, "Rohit");
        h.put(2, "Aman");
        h.put(3, "Virat");
        h.put(4, "Manju");
        h.put(null, null);

        System.out.println(h);

        Collection c = h.values();
        Collection c1 = h.keySet();

        System.out.println(c);      //print by sout simple
        System.out.println(c1);     //print by sout simple

        for (Object object : c) {
            System.out.println(object);
        }

        for (Object object : c1) {
            System.out.println(object);
            }



        LinkedHashMap lh= new LinkedHashMap();
        Hashtable ht = new Hashtable();
    }
}
