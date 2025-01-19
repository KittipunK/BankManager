
public class SavingsAccount extends BankAccount{

    public boolean debit(int pennies){
        if(pennies <= this.balance){
            this.balance -= (pennies);
            return true;
        }
        return false;
    }

    public void applyInterest(){
        if(this.balance > 0){
            this.balance += this.balance*this.interestRate;
        }
    }

    public String accountInfo(){
        String result = "Type of Account : Savings\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f";
        String result2 = String.format(result, this.accountID, this.balance/100.0, this.interestRate*100.0);
        String result3 = "%";
        return (result2 + result3);

    }
}