public class HondaFactoryOutlet implements CarFactoryOutlet{
    //
    @Override
    public Sedan createSedan(){
        return new HondaSedanFactory();
    }

    @Override
    public Hatchback createHatchback(){
        return new HondaHatchbackFactory();
    }
}
