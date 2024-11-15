public class Main {
    public static void main(String[] args) {

        //1)user requested for honda sedan and honda hatchback
        String clientRequestFor = "Honda";

        CarFactoryOutlet carFactoryOutlet = clientRequestFor == "Honda" ? new HondaFactoryOutlet() : new TataFactoryOutlet();

        // 2a: showroom requested for respective cars
        Showroom showroom = new Showroom(carFactoryOutlet);
        showroom.deliverCars();
    }
}