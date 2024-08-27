package June25Program;
public class methodexample {
    public static void m1() {
        m2();
    System.out.println("Hello");
    }
    public static void m2() {
        System.out.println("Hi");
        }
        public static void main(String[] args) {
            m1();
            m1();
        }
}
