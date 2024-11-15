public class Main {
    public static void main(String[] args) {
        Image image = new HighQualityProxyImage("DogImage.png");
        System.out.println("show loading first and display");
        image.displayImage();

        System.out.println("No loading, show display image");
        image.displayImage();
    }
}