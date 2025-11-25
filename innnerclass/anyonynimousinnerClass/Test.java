package innnerclass.anyonynimousinnerClass;

public class Test {
    public static void main(String[] args) {


        ShoppingCart shoppingCart=new ShoppingCart( 150);

        shoppingCart.processPayment(new Payment(){

            @Override
            public  void pay(double amount){
                System.out.println("Paid "+amount +"using Credit Card.");
            }
        });

        shoppingCart.processPayment(new Payment(){

            @Override
            public void pay(double amount){
                System.out.println("Paid "+ amount + "using Paypal..");
            }
        });









//        CreditCardV0 creditCardV0 =new CreditCardV0("3232");
//
//        shoppingCart.processPayment(creditCardV0);


    }
}
