package pizza.maker;

public class Poulet extends ToppingDecorator {

    public Poulet(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Poulet");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Poulet";
    }

    public double getCost() {
        return tempPizza.getCost() + 2.7;
    }

}