public class VendingMachineContext {
    VendingMachine state;

    public void setState(VendingMachine state){
        this.state = state;
    }
    public void request(){
        state.handleRequest();
    }
}
