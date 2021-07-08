package ihate.mylife;

public class BasicPizza implements Pizza{

    public BasicPizza(){
        System.out.println("Adding Doug");
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }

    @Override
    public int getId() {
        return 0;
    }
}


