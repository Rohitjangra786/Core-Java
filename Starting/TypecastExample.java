public class TypecastExample {
    public static void main(String[] args) {
        int a = 10;
        double d = a;   // (double) a Happens here internally.


        char c = ' ';  // ASCII value for spcae is 32 it will take that.
        int i = c;

        double r= 12.1;
        int v= (int)r;  // we not getting any error because we use the typecasting explicitely.
                        // If we use that implicitely it gonna show error.

        double doi=10.2;
        int k =(int)doi;

        double rohit= 1223.3421;
        char ram= (char)rohit;

        short sh= 'A';
        int b = (int)sh;


        System.out.println(d);
        System.out.println(i);
        System.out.println(v);
        System.out.println(k);
        System.out.println(ram);
        System.out.println(b);
        
    }
}
