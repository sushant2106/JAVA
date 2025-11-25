package exception.CustomException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }
    public  void withdraw(double amount) throws  InsufficinetFundException{
        if(amount>balance){
            throw new InsufficinetFundException(amount);
        }
        balance-=amount;
    }

}
