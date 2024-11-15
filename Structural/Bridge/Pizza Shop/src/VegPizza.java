public class VegPizza extends PizzaSizeBridge{

    private Pizza size;
    public VegPizza(Pizza size){
        super(size);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Veg Pizza " + size.getSize() + ", ";
    }
    public double getCost(){
        return size.getCost() + 250.00;
    }
}
