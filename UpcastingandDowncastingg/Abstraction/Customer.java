package UpcastingandDowncastingg.Abstraction;

public class Customer extends sbiATM{
    private String name;
    private String email;
    private int phone;
    private String address;
    private String city;
    private String state;
    public static void main(String[] args) {
        Customer c = new Customer();
        //sbiATM s = new Customer();    
        c.withdraw(200);
        c.withdrawMoney();
        c.depositMoney();
        System.out.println();

    }
    @Override //overriding the sbiATM
    public void withdrawMoney() {
        System.out.println("Customer withdraws money");
        }
    @Override //overriding the sbiATM depost classdf 
    public void depositMoney() {
        System.out.println("Customer deposits money");
    }

}
