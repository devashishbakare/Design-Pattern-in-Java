public class TataFactoryOutlet implements CarFactoryOutlet{
    @Override
    public Sedan createSedan(){
        return new TataSedanFactory();
    }

    @Override
    public Hatchback createHatchback(){
        return new TataHatchbackFactory();
    }
}
