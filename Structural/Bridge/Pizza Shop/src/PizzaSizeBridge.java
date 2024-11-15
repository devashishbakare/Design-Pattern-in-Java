abstract class PizzaSizeBridge {
    protected Pizza size;

    public PizzaSizeBridge(Pizza size){
        this.size = size;
    }

    public abstract String getDescription();

    public double getCost(){
        return size.getCost();
    }


}
