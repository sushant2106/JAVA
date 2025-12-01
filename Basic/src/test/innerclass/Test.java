package test.innerclass;

public class Test {
    public static void main(String[] args) {

        ShoppingClass shoping=new ShoppingClass(10000.0);

        shoping.processPayment(new Payment(){
            @Override
            public  void pay(double amount){
                System.out.println("Paid "+amount +"using Credit Card.");
            }

        });


    }
}
