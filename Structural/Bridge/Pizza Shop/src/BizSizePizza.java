public class BizSizePizza implements Pizza{

    @Override
    public String getSize() {
        return "Big";
    }

    @Override
    public double getCost() {
        return 100.00;
    }
}
