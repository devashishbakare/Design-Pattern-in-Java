public class YouTubeSubscriber implements Subscriber{

    public String name;

    public YouTubeSubscriber(String name){
        this.name = name;
    }
    @Override
    public void update(String channelName, String latestVideoName) {
        System.out.println("hey " +name + " " + channelName + " has uploaded new video " + latestVideoName);
    }
}
