package UpcastingandDowncastingg.Abstraction;

interface ATM {
    public static final int rohit=9;             // it must have to initialize the value otherwise it will give error. it is bydeafault final and public we can also write int rohit=9;
    abstract void withdraw(int amount); // we also can remove the abstract and public because the compier will automatically do that public and abstract.
    public static void m1(){
        System.out.println("Hello i am static method");
    }
    // in the interface all the access modifier is public only. if we remove the access modifier than it will be the public automatic.
    
    default void ATM(){
        System.out.println("I am default Non static concrete method"); //concreate non static method is allowed in java but it must have default it means that we have to write default. Constructor is not allowed in interface
    }

    /*  Three Types of interface :-
        1.Regular
        2.Functional
        3.Marker Interface   */
}