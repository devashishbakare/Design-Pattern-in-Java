public class HighResolutionImage implements Image{

    private String fileName;
    public HighResolutionImage(String fileName){
        this.fileName =fileName;
        showLoader();
    }

    public void showLoader(){
        System.out.println("your " + fileName + " Image is loading..");
    }

    @Override
    public void displayImage(){
        System.out.println("here is your high quality image " + fileName);
    }
}
