package UpcastingandDowncastingg;

public class blinkit extends Fruit {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        int aaaa=10;
        Orange o = new Orange();

        System.out.println(f);

        f=o;
        System.out.println(o);

        f = (Orange) o;
        System.out.println(f);

    }

    String region = "Haryana";

    public static void main(int a) {
        int aaaa=10;
    }
}
