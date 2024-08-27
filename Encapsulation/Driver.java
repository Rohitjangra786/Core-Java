
package Encapsulation;

public class Driver {
    public static void main(String[] args) {
        Bank b = new Bank("Rohit", 748l, 1234, 500, 7015204440l);
        /* 
        System.out.println(b.getBalance()); // getter method
        b.setBalance(6746396);  // setter method 
        System.out.println(b.getBalance()); // updated balance

        System.out.println(b.getPwd());*/
        System.out.println(b.getAccHolderName());
        System.out.println(b.getAccno());
        System.out.println(b.getPwd());
        System.out.println(b.getBalance());
        System.out.println(b.getPhno());

        b.setBalance(300.45);
        System.out.println(b.getBalance());

        b.setPhno(9548117037l);
        System.out.println(b.getPhno());

        /*b.setPwd(4321);
        int cv= b.getPwd();
        
        System.out.print("Enter your password: ");
        Scanner temp1 = new Scanner(System.in);
        int num = temp1.nextInt();
        if (num == cv) {
            System.out.println("you are valid user");
            System.out.print("Hi your password is ");
            System.out.println(b.getPwd());
            System.out.print("Account Holder Name is : ");
            System.out.println(b.getAccHolderName());
            System.out.print("Your Account No. is : ");
            System.out.println(b.getAccno());
            System.out.print("Your Balance is : ");
            System.out.println(b.getBalance());
            System.out.print("Your Mobile Number is : ");
            System.out.println(b.getPhno());
            
            System.out.println("Press 1 for Update Pwd");
            System.out.println("Press 2 for Update Balance");
            System.out.println("Press 3 for Update Mobile Number");
            Scanner temp = new Scanner(System.in);

            int Update= temp.nextInt();
            switch (Update) {
                case 1:
                    
                    break;
                case 2:
                double amount1= b.getBalance();
                System.out.println(b.getBalance());
                Scanner temp3 = new Scanner(System.in);
                System.out.println("Enter Amount to be Updated : ");
                double amount = temp.nextInt();
                b.setBalance( amount+ amount1);
                System.out.println(b.getBalance());
                    break;
                default:
                    break;
            }
           
        } else {
            System.out.println("Not valid User");
        }*/
    }
}
