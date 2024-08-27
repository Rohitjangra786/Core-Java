package UpcastingandDowncastingg.PolyMorohism;

class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class CompiletimePolymorphism {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(10, 20));         
        System.out.println(math.add(10, 20, 30));  
        System.out.println(math.add(10.5, 20.5)); 
    }
}

