package resources.groceries.grocerie;

public class Snack {

    private String name;
    private Double CHEETOS_PRICE = 0.49;
    private Double LAYS_PRICE = 0.79;
    private Double DORITOS_PRICE = 0.59;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        if (this.name == "Cheetos")
            return CHEETOS_PRICE;
        else if (this.name == "Lays")
            return LAYS_PRICE;
        else if (this.name == "Doritos")
            return DORITOS_PRICE;
        else return null;
    }
}
