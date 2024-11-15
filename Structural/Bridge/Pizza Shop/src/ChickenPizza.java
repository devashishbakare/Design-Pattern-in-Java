public class ChickenPizza extends PizzaSizeBridge{

    private Pizza size;
    public ChickenPizza(Pizza size){
        super(size);
        this.size = size;
    }
    @Override
    public String getDescription() {
        return "Chicken Pizza " + size.getSize() + ", " ;
    }

    public double getCost(){
        return size.getCost() + 200.00;
    }

}
