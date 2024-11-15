public class HomeAutomationRemoteFacade {
    public Lights lights;
    public AC ac;
    public Music music;

    public HomeAutomationRemoteFacade(){
        this.lights = new Lights();
        this.ac  = new AC();
        this.music = new Music();
    }

    public void movieMode() {
        System.out.println("Setting up Movie Mode...");
        lights.dimLight();
        music.turnOn();
        music.setVolume();
        ac.turnOn();
        ac.setTemperature();
    }

    public void partyMode() {
        System.out.println("Setting up Party Mode...");
        lights.turnOn();
        music.turnOn();
        music.setVolume();
        ac.turnOn();
        ac.setTemperature();
    }

    public void turnOffEverything() {
        System.out.println("Turning off all systems...");
        lights.turnOff();
        music.turnOff();
        ac.turnOff();
    }

}
