public class SumOf2number {
    public static void main(String[] args) {
        int a,b,c;
        a=12; b=13;
        c= a+b;             //Sum of the two integer

        float f4,f2,f3,d;
        f4=12.7f;
        f2=14.5f;
        f3=f4+f2;           // sum of the 2 floating integers

        d=(float)a+f4;      // sum of 1 float and other interger

        int i1,i2,i3,i4;
        i1=23; i2=24; 
        
        i3 = (byte)i1+i2;   // print of the 2 interger which stored in the byte container
        
        i4= (short)i3+i1;


        System.out.println(c);
        System.out.println(f3);
        System.out.println(d);
        System.out.println(i3);
        System.out.println(i4);
    }
}
