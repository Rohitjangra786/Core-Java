package UpcastingandDowncastingg;

public class ParentandChild {
    public static void main(String[] args) {
        Child c = new Child();
        c.main();
        System.out.println("1");

        parent p = new parent();
        p.main();
        System.out.println("2");

        parent p1= new Child();
        p1.main();
    }
}
