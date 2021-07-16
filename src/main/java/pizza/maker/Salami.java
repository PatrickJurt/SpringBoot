package pizza.maker;

public class Salami extends ToppingDecorator {

    public Salami(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Salami");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Salami";
    }

    public double getCost() {
        return tempPizza.getCost() + 3;
    }

}