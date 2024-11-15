public class Main {
    public static void main(String[] args) {

        HomeAutomationRemoteFacade remote = new HomeAutomationRemoteFacade();
        remote.partyMode();
        remote.movieMode();
        remote.turnOffEverything();

    }
}