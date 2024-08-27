package Exception_Handling;

public class ClassCastException {
    public static void main(String[] args) {
        Object obj = "hello";
        Integer num = (Integer) obj; // This line will throw a ClassCastException
    }
}
