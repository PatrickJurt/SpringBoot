package pizza.maker;

public class Chilli extends ToppingDecorator {

    public Chilli(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Chilli");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Chilli";
    }

    public double getCost() {
        return tempPizza.getCost() + 0.8;
    }

}