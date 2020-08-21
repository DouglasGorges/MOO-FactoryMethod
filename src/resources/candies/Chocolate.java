package resources.candies;

import resources.GroceryProducts;

public class Chocolate extends GroceryProducts {

    public Chocolate() {
        this.setName("Chocolate");
        this.setPrice(1.0);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }
}
