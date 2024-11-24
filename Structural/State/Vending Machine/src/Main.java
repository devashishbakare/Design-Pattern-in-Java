public class Main {
    public static void main(String[] args) {

        VendingMachineContext vendingMachineContext = new VendingMachineContext();

        System.out.println("Vending machine ready to serve");

        vendingMachineContext.setState(new ReadyToServe());
        vendingMachineContext.request();

        System.out.println("State Changed to Product Selection");

        vendingMachineContext.setState(new ProductSelection());
        vendingMachineContext.request();

        System.out.println("State Changed to Processing Payment");

        vendingMachineContext.setState(new ProcessingPayment());
        vendingMachineContext.request();

        System.out.println("State Changed to Product out of state");

        vendingMachineContext.setState(new OutOfStock());
        vendingMachineContext.request();

    }
}