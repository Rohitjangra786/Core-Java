package Exception_Handling;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(array[10]); // This line will throw an ArrayIndexOutOfBoundsException
    }
}