public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicRemote = new BasicRemote(tv);
        RemoteControl advancedRemote = new AdvancedRemote(radio);

        System.out.println("Using Basic Remote with TV:");
        basicRemote.togglePower();
        basicRemote.changeVolume(15);

        System.out.println("\nUsing Advanced Remote with Radio:");
        advancedRemote.togglePower();
        advancedRemote.changeVolume(10);
        ((AdvancedRemote) advancedRemote).mute();
    }
}