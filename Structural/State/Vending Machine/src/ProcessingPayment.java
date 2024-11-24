public class ProcessingPayment implements VendingMachine{
    @Override
    public void handleRequest() {
        System.out.println("Processing Payment : Product is ready to pick up");
    }
}
