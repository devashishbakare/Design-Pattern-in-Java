public class Level_1_Support extends CustomerCare{

    @Override
    public void handleRequest(String issueType) {
        if(issueType.equals("Basic")){
            System.out.println("Issue Has been Resolved by Level 1 support!!");
        }else if( customerCare != null){
          customerCare.handleRequest(issueType);
        }else{
            System.out.println("No Handler is available to handle this issue");
        }
    }
}
