public class Main {
    public static void main(String[] args) {

        Paypal paypal = new Paypal();
        PaypalAdapter paypalAdapter = new PaypalAdapter(paypal);
        paypalAdapter.pay(897.00);

        Stripe stripe = new Stripe();
        StripeAdapter stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.pay(100.00);





    }
}