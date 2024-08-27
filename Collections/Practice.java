package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        List <Integer> a = new ArrayList <Integer> ();
        Scanner s = new Scanner(System.in);
        
        System.out.println("How many elemnts you want to enter in the Collection");
        int times = s.nextInt();
        
        for (int i = 1; i <= times; i++) {
            System.out.print("Enter Element : ");
            a.add(s.nextInt());
        }

        System.out.println("The Collection before sorting is: " + a);
        
        // Sort the list
        Collections.sort(a);

        System.out.println("The Collection is after Sorting :"+a);
        System.out.println("Size of the Array is : "+a.size());
        System.out.println("Reference of the Iterable type Collection Object is  : "+a.iterator());

        Iterator <Integer>i = a.iterator(); // Refernece Stored in the Iterable i
        for (int j = 1; j <= a.size(); j++) {
            System.out.println("The Element of the Iterable type Collection Object is : "+ i.next());
        }
        
        // String as=a.toString();


    }
}
