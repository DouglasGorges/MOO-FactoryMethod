package application;

import resources.*;

public class Client extends GroceryMachine {

    private static Snack snack;
    private static Soda soda;
    private static Juice juice;


    public static void main(String[] args) {
        GroceryMachine groceryMachine = new GroceryMachine();

        snack = groceryMachine.getSnack("Cheetos");
        soda = groceryMachine.getSoda("Pepsi");
        juice = groceryMachine.getJuice("Kapo");

        if (!snack.getName().isEmpty() && snack.getPrice() != null)
            System.out.println(snack.getName() + " - $" + snack.getPrice());

        if (!soda.getName().isEmpty() && soda.getPrice() != null)
            System.out.println(soda.getName() + " - $" + soda.getPrice());

        if (!juice.getName().isEmpty() && juice.getPrice() != null)
            System.out.println(juice.getName() + " - $" + juice.getPrice());
    }
}
