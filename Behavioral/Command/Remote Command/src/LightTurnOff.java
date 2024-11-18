public class LightTurnOff implements Command{

    public Light light;
    public LightTurnOff(Light light){
        this.light = light;
    }
    @Override
    public void pressButton() {
        light.turnOff();
    }
}
