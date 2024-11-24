public class OutOfStock implements VendingMachine{
    @Override
    public void handleRequest() {
        System.out.println("Out Of Stock : Please try again sometimes later");
    }
}
