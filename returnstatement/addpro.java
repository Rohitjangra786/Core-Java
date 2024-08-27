package returnstatement;

public class addpro {
    
public static void main(String[] args) {
   int p= pro(4, 6);
    int sum=add(7, 5);
    System.out.println(p);
    System.out.println(sum);
}
public static int pro(int a,int b){
    return a*b;
     
}
public static int add(int a, int b){
    return a+b;
}
static {
    System.out.println("static block");
}
}
