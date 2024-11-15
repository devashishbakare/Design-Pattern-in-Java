public class BaseCoffee implements Coffee{

    @Override
    public String getDescription(){
        return "base coffee";
    }

    @Override
    public double getCost(){
        return 100.00;
    }
}
