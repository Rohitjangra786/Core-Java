package UpcastingandDowncastingg;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();

        // Using instanceof to check the type of animal1
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1; // Downcasting
            dog.bark(); // Outputs: Dog barks
        }

        // Using instanceof to check the type of animal2
        if (animal2 instanceof Cat) {
            Cat cat = (Cat) animal2; // Downcasting
            cat.meow(); // Outputs: Cat meows
        }

        // Using instanceof to check the type of animal3
        if (animal3 instanceof Dog) {
            Dog dog = (Dog) animal3; // Downcasting
            dog.bark(); // This block won't be executed
        } else if (animal3 instanceof Cat) {
            Cat cat = (Cat) animal3; // Downcasting
            cat.meow(); // This block won't be executed
        } else if (animal3 instanceof Animal) {
            animal3.makeSound(); // Outputs: Animal makes a sound
        }

        // Using instanceof with interfaces
        if (animal1 instanceof Animal) {
            animal1.makeSound(); // Outputs: Animal makes a sound
        }
    }
}
