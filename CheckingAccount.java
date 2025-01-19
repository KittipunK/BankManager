public class CheckingAccount extends BankAccount{
    private int overdraftFee = 0;

    public boolean debit(int pennies){
        if(this.balance >= pennies){
            this.balance -= pennies;
            
        }else if(this.balance <= 0){
            this.balance -= pennies;
            this.balance -= overdraftFee;
        }
        else{
            this.overdraftFee = pennies - this.balance;
            this.balance = this.balance - pennies;
        }
        return true;
    }

    public void setFee(int fee){ 
        this.overdraftFee = fee;
    }

    public int getFee(){ return this.overdraftFee; }

    public void applyInterest(){
        if(this.balance > 0){
            this.balance += this.balance * this.interestRate;
        }
    }

    public String accountInfo(){
        String result = "Type of Account : Checking\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f";
        String result2 = String.format(result, this.accountID, this.balance/100.0, this.interestRate*100.0);
        String result3 = "%";
        String result4 = "\nOverdraft Fee   : $%.2f";
        String result5 = String.format(result4, this.overdraftFee/100.0);
        return (result2 + result3+result5);
    }
}