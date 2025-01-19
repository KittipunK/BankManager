public abstract class BankAccount {
    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate;
    protected int balance;
    
    public boolean credit(int pennies){ this.balance += pennies; return true; };
    public abstract boolean debit(int argument);
    public int getBalance(){ return this.balance; };
    public String getAccountID(){ return this.accountID; };
    public void setAccountID(String id){ this.accountID = id; };
    public double getInterestRate(){ return this.interestRate; };
    public void setInterestRate(double rate){ this.interestRate = rate; };
    public abstract void applyInterest();
    public abstract String accountInfo();

}