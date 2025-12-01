package oops.encapsulation;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public void deposit(double amount){

        if(amount>0){
            this.balance+=amount;
            System.out.println("Deposited:"+amount);
        }
        else{
            System.out.println("Invalid Deposit Amount");
        }

    }

    public  void withdraw(double amount){
        if(this.balance >=amount && amount>0){
            this.balance-=amount;
            System.out.println("Withdrew:"+amount);

        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public  long getAccountNumber(){
        return this.accountNumber;
    }
//    public void setBalance(double balance){
//        this.balance=balance;
//    }
    public  double getBalance(){
        return this.balance;
    }
}
