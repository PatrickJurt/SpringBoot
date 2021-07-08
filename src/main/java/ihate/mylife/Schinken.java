package ihate.mylife;

public class Schinken extends ToppingDecorator {

    public Schinken(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Schinken");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Schinken";
    }

    public double getCost() {
        return tempPizza.getCost() + 3;
    }

}