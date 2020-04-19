package application;

import resources.candies.Candie;
import resources.coffees.Coffee;
import resources.groceries.Grocery;
import resources.GroceryProducts;

public class GroceryMachine implements GroceryProducts {

    @Override
    public Grocery getGrocery() {
        Grocery grocery = new Grocery();
        return grocery;
    }
}
