package resources.coffees;

import resources.GroceryProducts;

public class CaffeMacchiato extends GroceryProducts {

    public CaffeMacchiato() {
        prepare();
    }

    private void prepare(){
        this.setName("Macchiato");
        this.setPrice(3.5);
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
