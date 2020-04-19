package resources;

public class GroceryMachine implements Grocery{

    @Override
    public Snack getSnack(String name) {
        Snack snack = new Snack();
        snack.setName(name);

        return snack;
    }

    @Override
    public Soda getSoda(String name) {
        Soda soda = new Soda();
        soda.setName(name);
        return soda;
    }

    @Override
    public Juice getJuice(String name) {
        Juice juice = new Juice();
        juice.setName(name);
        return juice;
    }
}
