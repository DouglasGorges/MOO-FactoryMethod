package resources;

import resources.candies.Chocolate;
import resources.coffees.Americano;
import resources.coffees.CaffeMacchiato;
import resources.coffees.ExpressoLungo;
import resources.coffees.ShortExpresso;
import resources.grocerie.Juice;
import resources.grocerie.Snack;
import resources.grocerie.Soda;

public class GroceryMachine {

    public GroceryProducts productDelivery(String productName) {
        GroceryProducts product = null;

        switch (productName) {
            case "Snack":
                product = new Snack();
                break;
            case "Soda":
                product = new Soda();
                break;
            case "Juice":
                product = new Juice();
                break;
            case "Chocolate":
                product = new Chocolate();
                break;
            case "Short":
                product = new ShortExpresso();
                break;
            case "Lungo":
                product = new ExpressoLungo();
                break;
            case "Macchiato":
                product = new CaffeMacchiato();
                break;
            case "Americano":
                product = new Americano();
                break;
            default:
                break;
        }

        return product;
    }

}