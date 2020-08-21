package application;

import resources.GroceryMachine;
import resources.GroceryProducts;

public class Client extends GroceryMachine {

    public static void main(String[] args) {
        GroceryMachine groceryMachine = new GroceryMachine();

//        GroceryProducts request = groceryMachine.productDelivery("Snack");
//        GroceryProducts request = groceryMachine.productDelivery("Juice");
//        GroceryProducts request = groceryMachine.productDelivery("Soda");
//        GroceryProducts request = groceryMachine.productDelivery("Chocolate");
//        GroceryProducts request = groceryMachine.productDelivery("Short");
//        GroceryProducts request = groceryMachine.productDelivery("Lungo");
//        GroceryProducts request = groceryMachine.productDelivery("Macchiato");
        GroceryProducts request = groceryMachine.productDelivery("Americano");

        System.out.println(request.getName() +" - "+ request.getPrice());



    }
}
