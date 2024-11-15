public class RealInternetAccess implements InternetAccess{
    private String employeeName;

    public RealInternetAccess(String employeeName){
        this.employeeName = employeeName;
    }
    @Override
    public void grantInternetAccess(){
        System.out.println("Internet Access is granted to " + employeeName);
    }
}
