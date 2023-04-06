import java.util.*;
class Amount{
    private String currency;
    private int amount;
    Amount(String currency,int amount){
        super();
        this.currency=currency;
        this.amount=amount;
    }
    //-------------------checked Exception--------------------------------------
      public void add(Amount that) throws Exception{
        if(this.currency.equalsIgnoreCase(that.currency))
        {
             this.amount+=that.amount;
           
        }
        else{
             throw new Exception("Currency don't match "+this.currency+"  "+that.currency);
        }
        
    }
    public String toString(){
        return amount+" "+currency;
    }
}
public class Main
{
	public static void main(String[] args) throws Exception{
	    Amount amount1=new Amount("USD",10);
	    Amount amount2=new Amount("EUR",20);
	    amount1.add(amount2);
	    System.out.println(amount1);
	}
}
