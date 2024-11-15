public class Main {
    public static void main(String[] args) {

        InternetAccess internetAccess = new ProxyInternetAccess("Devashish Bakare");
        internetAccess.grantInternetAccess();

        internetAccess = new ProxyInternetAccess("John Doe");
        internetAccess.grantInternetAccess();
    }
}