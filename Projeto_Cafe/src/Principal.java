
public class Principal {
	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
        printInfo(c);

        c = new WithMilk(c);
        printInfo(c);

        c = new WithChantilly(c);
        printInfo(c);
        
        c = new CoffeeExpresso(c);
        printInfo(c);

	}
	
	public static void printInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }
}
