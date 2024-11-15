class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Toggling power (Advanced)...");
        device.turnOn();
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("Changing volume (Advanced)...");
        device.setVolume(volume);
    }

    public void mute() {
        System.out.println("Muting device...");
        device.setVolume(0);
    }
}