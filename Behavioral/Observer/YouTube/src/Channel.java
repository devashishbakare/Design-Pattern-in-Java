public interface Channel {
    void subscribeChannel(YouTubeSubscriber subcriber);
    void unSubscribeChannel(YouTubeSubscriber subcriber);
    void notifySubscriber();
}
