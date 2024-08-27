package UpcastingandDowncastingg.PolyMorohism;

class rohit{
    public void me(){
        System.out.println("I am Rohit");
    }
}
class PG extends rohit{
    @Override  // Overriding the rohit method
    public void me(){
        System.out.println("I am PG");
    }
}
class Qspider extends PG{
    @Override  // Overriding the PG method
    public void me(){
        System.out.println("I am Qspider");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        rohit rr=new rohit();
        System.out.println();
    }
}
