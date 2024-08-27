package June25Program.secondjulyACTIVITY;
public class third
    
    
{
    public static void main(String[] args)
    {
        main1(0);
        main2(false);
        main3(1.0f);
        main4(1.0);
        main5('a');
        main6(1l);
        System.out.println("Hello");}



public static void main1(int i)
{
    if(i<5)
    {
        System.out.println("Hi");
        main1(i+1);
        }   
        }
        public static void main2(boolean a) {
            if(a==true){
                System.out.println("Hi");
            }
            
        }
        public static void main3(float a) {
            if(a==1.0){
                System.out.println("Good Morning");
            
        }
}
public static void main4(double d) {
    if(d==1.0){
        System.out.println("Good NIGHT");
        }
    
}
public static void main5(char a) {
    if(a=='a') {
        System.out.println("Character method");
        }
    
}
public static void main6(long s) {
    if(s==1) {
        System.out.println("Long method");
        }
    
}

}