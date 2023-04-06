import java.util.*;
class Amount{
    private String currency;
    private int amount;
    Amount(String currency,int amount){
        super();
        this.currency=currency;
        this.amount=amount;
    }
   
      public void add(Amount that) throws  currencyDontmatch{
        if(this.currency.equalsIgnoreCase(that.currency))
        {
             this.amount+=that.amount;
           
        }
        else{
             throw new currencyDontmatch("Currency don't match "+this.currency+"  "+that.currency);
        }
        
    }
    public String toString(){
        return amount+" "+currency;
    }
}
class  currencyDontmatch extends Exception{
    public currencyDontmatch(String msg){
        super(msg);
    }
}




public class Main
{
	public static void main(String[] args) throws currencyDontmatch{
	    Amount amount1=new Amount("USD",10);
	    Amount amount2=new Amount("EUR",20);
	    amount1.add(amount2);
	    System.out.println(amount1);
	}
}
