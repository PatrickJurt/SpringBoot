package pizza.maker;

public class Parmesan extends ToppingDecorator {

    public Parmesan(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Parmesan");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Parmesan";
    }

    public double getCost() {
        return tempPizza.getCost() + 1.2;
    }

}