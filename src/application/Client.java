package application;

import resources.groceries.Grocery;

public class Client extends GroceryMachine {

    private static Grocery grocery;


    public static void main(String[] args) {
        GroceryMachine groceryMachine = new GroceryMachine();

        groceryMachine.getGrocery().getSnack().setName("Cheetos");
        groceryMachine.getGrocery().getSoda().setName("Pepsi");
        groceryMachine.getGrocery().getJuice().setName("Kapo");

    }
}
