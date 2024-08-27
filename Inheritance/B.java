package Inheritance;

public class B extends A {

    public double area(){
        return l*b;
    }

    public double peri(){
        return (l+b)*2;
    }
    public static void main(String[] args) {
        
        B aa= new B();
        System.out.println(aa.area());

        B ab = new B();
        System.out.println(ab.peri());
    }
}
