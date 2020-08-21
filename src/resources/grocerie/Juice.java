package resources.grocerie;

import resources.GroceryProducts;

public class Juice extends GroceryProducts {

    public Juice() {
        this.setName("Juice");
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
