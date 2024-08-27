package Collections;
import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {

        //ArrayList follows insertion order
        ArrayList a=new ArrayList();

        a.add(1);
        a.add(3);
        a.add("Rohit");
        a.add('c');
        a.add(3.4f);
        a.add(3);

        a.remove("Rohit");
        
        System.out.println(a.contains("Rohit"));


        System.out.println(a);

        System.out.println(a.iterator());  //java.util.ArrayList$Itr@2f92e0f4

        System.out.println(a.isEmpty());  //false
        System.out.println(a.size());  //5
        System.out.println(a.toArray());  //[Ljava.lang.Object;@28a418fc
  }
    
}
