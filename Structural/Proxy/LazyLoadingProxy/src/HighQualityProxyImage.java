public class HighQualityProxyImage implements Image{
    public HighResolutionImage highResolutionImage;
    public String fileName;

    public HighQualityProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void displayImage(){
        if(highResolutionImage == null){
            highResolutionImage = new HighResolutionImage(fileName);
        }
        highResolutionImage.displayImage();
    }
}
