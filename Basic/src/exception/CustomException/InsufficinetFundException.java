package exception.CustomException;

public class InsufficinetFundException extends Exception {

    private double amount;
    public  InsufficinetFundException(double amount){
        super("What do you want?You don't have money");

    }

    public  double getAmount(){
        return amount;
    }
}
