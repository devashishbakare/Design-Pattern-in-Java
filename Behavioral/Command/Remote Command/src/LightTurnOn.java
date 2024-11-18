public class LightTurnOn implements Command {
    public Light light;
    public LightTurnOn(Light light){
        this.light = light;
    }
    @Override
    public void pressButton() {
        light.turnOn();
    }
}
