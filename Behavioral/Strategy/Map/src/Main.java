public class Main {
    public static void main(String[] args) {
        MapTransportStrategy mapTransportStrategy = new MapTransportStrategy();

        mapTransportStrategy.setMethodOfTransport(new Bike());
        double distance = mapTransportStrategy.calulateDistance("locationA", "locationB");
        System.out.println("Time needed to reach from Location A to Location B is " + distance);


        mapTransportStrategy.setMethodOfTransport(new Car());
        distance = mapTransportStrategy.calulateDistance("locationA", "locationB");
        System.out.println("Time needed to reach from Location A to Location B is " + distance);

        mapTransportStrategy.setMethodOfTransport(new Train());
        distance = mapTransportStrategy.calulateDistance("locationA", "locationB");
        System.out.println("Time needed to reach from Location A to Location B is " + distance);


    }
}