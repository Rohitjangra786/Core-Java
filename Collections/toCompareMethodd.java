package Collections;

import java.util.Collection;
import java.util.Collections;

public class toCompareMethodd {
        String name;
        int age;
    public static void main(String[] args) {

        toCompareMethod tr= new toCompareMethod();
        
        toCompareMethodd t1 = new toCompareMethodd();
        t1.name = "Rohit";
        t1.age = 18;

        toCompareMethodd t2 = new toCompareMethodd();
        t2.name = "Mohit";
        t2.age = 19;

        System.out.println(t1);  //t1.toString()
        System.out.println(t2);
    }

    @Override
    public String toString(){
        return name + " "+ age + " ";
    }
}
