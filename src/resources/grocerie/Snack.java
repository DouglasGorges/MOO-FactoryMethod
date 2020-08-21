package resources.grocerie;

import resources.GroceryProducts;

public class Snack extends GroceryProducts {

    public Snack() {
        this.setName("Snack");
        this.setPrice(2.0);
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
