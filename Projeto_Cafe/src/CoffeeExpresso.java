
public class CoffeeExpresso extends CoffeeDecorator{

	public CoffeeExpresso(Coffee c) {
        super(c);
	    }

	    @Override
	    public double getCost() { 
	        return super.getCost() + 5.5;
	    }

	    @Override
	    public String getIngredients() {
	        return super.getIngredients() + ", Expresso";
	    }
}
