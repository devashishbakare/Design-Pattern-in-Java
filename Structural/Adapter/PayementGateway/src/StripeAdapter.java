public class StripeAdapter implements PaymentProcessor{

    Stripe stripe;
    public StripeAdapter(Stripe stripe){
        this.stripe = stripe;
    }

    @Override
    public void pay(double amount){
        stripe.makePayment(amount);
    }

}
