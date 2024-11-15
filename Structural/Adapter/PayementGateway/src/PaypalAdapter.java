public class PaypalAdapter implements PaymentProcessor{

    Paypal paypal;

    public PaypalAdapter(Paypal paypal){
        this.paypal = paypal;
    }

    @Override
    public void pay(double amount){
        paypal.makePayment(amount);
    }
}
