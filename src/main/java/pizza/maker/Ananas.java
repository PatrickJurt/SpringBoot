package pizza.maker;

public class Ananas extends ToppingDecorator {

    public Ananas(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Ananas");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Ananas";
    }

    public double getCost() {
        return tempPizza.getCost() + 2;
    }

}