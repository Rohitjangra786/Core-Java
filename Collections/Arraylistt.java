package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Arraylistt {
    public static void main(String[] args) {

    try {
        ArrayList a=new ArrayList();
        a.add(1);
        a.add("Rohit");
        a.add("aman");
        a.add("Virat");
        a.add('a');
        a.add(2.5);

        // System.out.println(a);
        // System.out.println(a.get(0));

        // for(Object i:a){
        //     System.out.println(i);
        // }

        Iterator i =a.iterator();

        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        
    } catch (NoSuchElementException e) {
        //e.printStackTrace();
        System.out.println("Next Element Not exists");
    }
        catch(Exception e){
            System.out.println("No data exists");
        }

    }
}
