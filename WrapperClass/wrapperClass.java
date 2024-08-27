package WrapperClass;

public class wrapperClass extends Exception {

    public static void main(String[] args) {
        // Boxing :- Converting primitive data into non-Primitive
        Integer i = 10; //AutoBoxing
        int j = i;  //Auto-UnBoxing
        System.out.println(j);
    
        wrapperClass w= new wrapperClass();
        System.out.println(w);  
        Integer ii = new Integer(6);

        Byte b = 9;
        Byte bb= new Byte(b);
        System.out.println(bb);

        String s= "Rohit";
        
        s.toLowerCase();
        wrapperClass ww= new wrapperClass();
        
        System.out.println(s.toLowerCase());
        
    }   
}
