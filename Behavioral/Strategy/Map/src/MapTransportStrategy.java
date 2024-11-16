public class MapTransportStrategy {
    private Map methodOfTransport;

    public void setMethodOfTransport(Map methodOfTransport) {
        this.methodOfTransport = methodOfTransport;
    }
    public double calulateDistance(String locationA, String locationB){
        return methodOfTransport.calculateDistance(locationA, locationB);
    }
}
