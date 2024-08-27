package UpcastingandDowncastingg.Abstraction;

public class Newtest implements ATM {

    @Override
    public void withdraw(int amount){
        System.out.println(amount);  
    
    }
    public static void main(String[] args) {
        System.out.println("Access Done");
        Newtest aa = new Newtest();
        aa.ATM();
        aa.withdraw(2000);
        System.out.println(ATM.rohit);

        ATM.m1();
        
    }
    
}
