package resources;

public abstract class GroceryProducts {
    String name = null;
    Double price = null;

    public Double getPrice(){
        return this.price;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
