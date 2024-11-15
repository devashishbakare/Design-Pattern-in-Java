public class Showroom {
    private Hatchback hatchback;
    private Sedan sedan;
    // 2b : showroom send request to common car factory outlet to create hatchback and sedan
    public Showroom(CarFactoryOutlet carFactoryOutlet){
        this.hatchback = carFactoryOutlet.createHatchback();
        this.sedan = carFactoryOutlet.createSedan();
    }

    public void deliverCars(){
        hatchback.assemble();
        sedan.assemble();
    }
}
