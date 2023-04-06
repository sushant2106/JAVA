import java.util.*;

//Uncheked Exception RuntimeException
class Amount{
    private String currency;
    private int amount;
    Amount(String currency,int amount){
        super();
        this.currency=currency;
        this.amount=amount;
    }
    public void add(Amount that){
        if(this.currency.equalsIgnoreCase(that.currency))
        {
             this.amount+=that.amount;
           
        }
        else{
             throw new RuntimeException("Currency don't match");
        }
        
    }
    public String toString(){
        return amount+" "+currency;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Amount amount1=new Amount("USD",10);
	    Amount amount2=new Amount("EUR",20);
	    amount1.add(amount2);
	    System.out.println(amount1);
	}
}
