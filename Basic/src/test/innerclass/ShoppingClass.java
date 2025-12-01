package test.innerclass;

public class ShoppingClass  {
    private double totalamount;

    public ShoppingClass(double totalamount){
        this.totalamount=totalamount;
    }

    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalamount);
    }


}
