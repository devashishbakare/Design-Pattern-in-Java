import java.util.*;
public class YouTubeChannel implements Channel {

    private List<YouTubeSubscriber> subscriberList;
    private String channelName;
    private String latestVideoName;

    public YouTubeChannel(String channelName){
        subscriberList = new ArrayList<>();
        this.channelName = channelName;
    }

    @Override
    public void subscribeChannel(YouTubeSubscriber subscriber) {
        System.out.println(subscriber.name + " has subscribe you "+ channelName);
        subscriberList.add(subscriber);
    }

    @Override
    public void unSubscribeChannel(YouTubeSubscriber subscriber) {
        System.out.println(subscriber.name + " has un-subscribe you "+ channelName);
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(YouTubeSubscriber sub : subscriberList){
            sub.update(channelName, latestVideoName);
        }
    }

    public void uploadVideo(String latestVideoName){
        this.latestVideoName = latestVideoName;
        notifySubscriber();
    }
}
