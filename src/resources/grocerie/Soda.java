package resources.grocerie;

import resources.GroceryProducts;

public class Soda extends GroceryProducts {

    public Soda() {
        this.setName("Soda");
        this.setPrice(3.0);
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
