package resources.groceries.grocerie;

public class Juice {

    private String name;
    private Double KAPO_PRICE = 0.69;
    private Double DELVALE_PRICE = 0.99;
    private Double PRATS_PRICE = 1.99;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        if (this.name == "Kapo")
            return KAPO_PRICE;
        else if (this.name == "Del Vale")
            return DELVALE_PRICE;
        else if (this.name == "Prats")
            return PRATS_PRICE;
        else return null;
    }
}
