package resources.coffees;

import resources.GroceryProducts;

public class Americano extends GroceryProducts {

    public Americano() {
        prepare();
    }

    private void prepare(){
        this.setName("Short");
        this.setPrice(4.5);
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
