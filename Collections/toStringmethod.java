package Collections;

import java.util.Collection;
import java.util.Collections;

public class toStringmethod {
        String name;
        int age;
    public static void main(String[] args) {
        
        toStringmethod t1 = new toStringmethod();
        t1.name = "Rohit";
        t1.age = 25;

        toStringmethod t2 = new toStringmethod();
        t2.name = "Parijat";
        t2.age = 26;

        System.out.println(t1);
        System.out.println(t2);
    }
    @Override
    public String toString(){
        return "Name: "+name+" Age: "+age;
    
    }
}
