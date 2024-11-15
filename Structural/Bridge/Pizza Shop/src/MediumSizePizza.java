public class MediumSizePizza implements Pizza{


    @Override
    public String getSize() {
        return "Medium";
    }

    @Override
    public double getCost() {
        return 75.00;
    }
}
