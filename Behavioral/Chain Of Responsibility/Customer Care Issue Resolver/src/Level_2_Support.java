public class Level_2_Support extends CustomerCare{

    @Override
    public void handleRequest(String issueType) {
        if(issueType.equals("Advance")){
            System.out.println("Issue Has been Resolved by Level 2 support!!");
        }else if( customerCare != null){
          customerCare.handleRequest(issueType);
        }else{
            System.out.println("No Handler is available to handle this issue");
        }
    }
}
