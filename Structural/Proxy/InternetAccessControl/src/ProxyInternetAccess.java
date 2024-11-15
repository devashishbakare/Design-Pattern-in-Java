public class ProxyInternetAccess implements InternetAccess{

    private RealInternetAccess realInternetAccess;
    private String employeeName;
    private String employeeDb[] = {"john doe"};

    public ProxyInternetAccess(String employeeName){
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if(checkEmployeeNameInDb(employeeName)){
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        }else{
            System.out.println("Employee " + employeeName + " is not register in db");
        }
    }

    public boolean checkEmployeeNameInDb(String employeeName){
        //check employee name is db
        for(String name : employeeDb) if(employeeName.toLowerCase().equals(name))return true;
        return false;
    }
}
