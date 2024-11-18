public class Manager extends CustomerCare{

    @Override
    public void handleRequest(String issueType) {
        System.out.println("Issue has been resolved by Manager!!");
    }
}
