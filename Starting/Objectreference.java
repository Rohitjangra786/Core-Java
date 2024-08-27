public class Objectreference {
    public static void main(String[] args) {
        
        long[] longArray = new long[5];
        short[] shortArray = new short[5];
        float[] floatArray = new float[5];
        double[] doubleArray = new double[5];
        byte[] byteArray = new byte[5];
        int[ ] intArray = {2,3,4,5,6};

        
        System.out.println("Long Array Object Reference: " + longArray);
        System.out.println("Short Array Object Reference: " + shortArray);
        System.out.println("Float Array Object Reference: " + floatArray);
        System.out.println("Double Array Object Reference: " + doubleArray);
        System.out.println("Byte Array Object Reference: " + byteArray);
        System.out.println("Array Int Type : "+intArray);


        int []a;
        a= new int[4];
        a[0]=24;
        a[1]=34;
        a[2]=45;
        a[3]=13;
        System.out.println(a[3]);

        for (int i : a) {
            
            System.out.println(i);
            }
        

        float [] b;
        b = new float[3];
        b[0]=1.2f;
        b[1]=2.3f;
        b[2]=3.4f;
        System.out.println(b[2]);

        for (float m : b) {
            System.out.println(m);
            }

        boolean [] c;
        c = new boolean[2];
        c[0]=true;
        c[1]=false;
        System.out.println(c[0]);

        for (boolean n : c) {
            System.out.println(n);
            
        }


        String [] d;
        d = new String[3];
        d[0]="Hello";
        d[1]="World";
        d[2]="Java";
        System.out.println(d[2]);

        for (String o : d) {
            System.out.println(o);
            
        }
    }
}