public class SmallSizePizza implements Pizza{

    @Override
    public String getSize() {
        return "small";
    }

    @Override
    public double getCost() {
        return 50.00;
    }
}
