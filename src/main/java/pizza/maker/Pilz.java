package pizza.maker;

public class Pilz extends ToppingDecorator {

    public Pilz(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Pilz");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Pilz";
    }

    public double getCost() {
        return tempPizza.getCost() + 0.8;
    }

}