package Exception_Handling;

public class StringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.charAt(10)); // This line will throw a StringIndexOutOfBoundsException
    }
}