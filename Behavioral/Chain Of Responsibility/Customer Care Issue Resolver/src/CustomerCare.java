abstract public class CustomerCare {

    public CustomerCare customerCare;
    public void setNextHandler(CustomerCare customerCare){
        this.customerCare = customerCare;
    }

    public abstract void handleRequest(String issueType);
}
