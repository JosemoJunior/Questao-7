
public class WithCoberturas extends CoffeeDecorator{
	
	public WithCoberturas(Coffee c) {
        super(c);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.3;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Cobertura";
    }
}
