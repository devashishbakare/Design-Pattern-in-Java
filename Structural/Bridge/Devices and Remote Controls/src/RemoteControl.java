// this is bridge between product and variation of product
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
    public abstract void changeVolume(int volume);
}
