public class Main {
    public static void main(String[] args) {

        YouTubeChannel mrBeast = new YouTubeChannel("MrBeast");

        YouTubeSubscriber sub1 = new YouTubeSubscriber("John");
        YouTubeSubscriber sub2 = new YouTubeSubscriber("Kia");

        mrBeast.subscribeChannel(sub1);
        mrBeast.subscribeChannel(sub2);

        mrBeast.uploadVideo("7 Days Exploring An Underground City");

        mrBeast.unSubscribeChannel(sub2);

        mrBeast.uploadVideo("$1 vs $250,000 Vacation!");


    }
}