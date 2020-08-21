package resources.coffees;

import resources.GroceryProducts;

public class ExpressoLungo extends GroceryProducts {

    public ExpressoLungo() {
        prepare();
    }

    private void prepare(){
        this.setName("Lungo");
        this.setPrice(2.5);
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
