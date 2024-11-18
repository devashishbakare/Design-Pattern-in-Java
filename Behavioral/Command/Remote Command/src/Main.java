public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Command turnOnCommand = new LightTurnOn(light);
        Command turnOffCommand = new LightTurnOff(light);

        RemoteCommandExecuter remote = new RemoteCommandExecuter();
        remote.pressButton(turnOnCommand);
        remote.pressButton(turnOffCommand);
    }
}