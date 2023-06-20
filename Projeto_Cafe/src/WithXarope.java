
public class WithXarope extends CoffeeDecorator{
	
	public WithXarope(Coffee c) {
        super(c);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Xarope";
    }
}
