public class CreditcardAccount extends BankAccount{
    private int limit = 0;

    public boolean debit(int pennies){
        if((this.balance - pennies) >= -limit){
            this.balance -= pennies;
            return true;
        }
        return false;
    }

    public void setLimit(int lim){ this.limit = lim; }

    public int getLimit(){ return this.limit; }

    public void applyInterest(){
        if(this.balance < 0){
            this.balance += this.balance*this.interestRate;
        }
        
    }

    public String accountInfo(){
        String result = "Type of Account : Creditcard\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f";
        String result2 = String.format(result, this.accountID, this.balance/-100.0, this.interestRate*100.0);
        String result3 = "%";
        String result4 = "\nCredit Limit    : $%.2f";
        String result5 = String.format(result4, this.limit/100.0);
        return (result2 + result3+result5);
    }
}