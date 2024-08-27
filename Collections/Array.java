package Collections;
import java.util.*;

/**
 * Array
 */
public class Array {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(6);  // auto boxing is happening here thats why it is not giving any error for the each value there should be object created in the memory beacause collections is the group of the objects.

        // incremental size of the array list.
        a.add(8);
        a.add("hi");

        System.out.println(a);

        HashSet h = new HashSet();

        h.add(4);
        h.add(7);
        h.add("Hello");
        h.add(5);
        h.add(null);
        h.add(78.9);

        System.out.println(h);
    }
}