public class Cream extends CoffeeDecorator{

    public Cream(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " Cream, ";
    }

    @Override
    public double getCost(){
        return super.getCost() + 5.00;
    }

}
