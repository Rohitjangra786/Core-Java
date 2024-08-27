package Encapsulation;

public class Bank {
    private String AccHolderName;
    private Long accno;
    private int pwd;
    private double balance;
    private long phno;

    public String getAccHolderName() {
        return AccHolderName;
    }
    public Long getAccno() {
        return accno;
    }
    public double getBalance() {
        return balance;
    }
    public int getPwd() {
        return pwd;
    }
    public long getPhno() {
        return phno;
    }
    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPhno(long phno) {
        this.phno = phno;
    }
    
    public Bank (String AccHolderName, Long accno,int pwd, double balance, long phno) {
        this.AccHolderName = AccHolderName;
        this.accno = accno;
        this.balance = balance;
        this.pwd = pwd;
        this.phno = phno;
       
    }

}
