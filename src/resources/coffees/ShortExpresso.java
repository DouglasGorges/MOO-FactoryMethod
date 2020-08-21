package resources.coffees;

import resources.GroceryProducts;

public class ShortExpresso extends GroceryProducts {

    public ShortExpresso() {
        prepare();
    }

    private void prepare(){
        this.setName("Short");
        this.setPrice(1.5);
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
