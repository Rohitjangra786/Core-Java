public class PrintArrays {
    public static void main(String[] args) {
        // int array
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("int array: " + java.util.Arrays.toString(intArray));

        // short array
        short[] shortArray = {10, 20, 30, 40, 50};
        System.out.println("short array: " + java.util.Arrays.toString(shortArray));

        // long array
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        System.out.println("long array: " + java.util.Arrays.toString(longArray));

        // byte array
        byte[] byteArray = {1, 2, 3, 4, 5};
        System.out.println("byte array: " + java.util.Arrays.toString(byteArray));

        // float array
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println("float array: " + java.util.Arrays.toString(floatArray));

        // double array
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("double array: " + java.util.Arrays.toString(doubleArray));
    }
}