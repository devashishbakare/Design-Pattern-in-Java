class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Toggling power...");
        device.turnOn();
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("Changing volume...");
        device.setVolume(volume);
    }
}