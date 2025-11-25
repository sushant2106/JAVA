package exception.CustomException;



public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(10.0);

        try{
            bankAccount.withdraw(11);
        }
        catch (InsufficinetFundException e){
            System.out.println(e);
        }




    }
}
