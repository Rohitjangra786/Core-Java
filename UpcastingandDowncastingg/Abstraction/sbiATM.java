package UpcastingandDowncastingg.Abstraction;

abstract class sbiATM implements ATM{

    static String username;
    int pin;
    
    public abstract void withdrawMoney();
    public abstract void depositMoney();

    static{
        System.out.println("Static block of SBI ATM");
    }
    
    {
        System.out.println("Nonstatic block of SBI ATM");
    }

    public double addfund(){
        return addfund();
    }

    public static double addextrafun(){
        return addextrafun();
    }

    void sbiATM(){
        System.out.println("SBI ATM");
    }

    @Override
    public void withdraw(int amount){
        System.out.println("Withdrawal of Rs."+amount+" from SBI ATM");
    }
}
