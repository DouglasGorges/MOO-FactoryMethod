package resources.groceries.grocerie;

public class Soda {

    private String name;
    private Double PEPSI_PRICE = 0.99;
    private Double COKE_PRICE = 0.99;
    private Double SPRITE_PRICE = 0.89;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        if (this.name == "Pepsi")
            return PEPSI_PRICE;
        else if (this.name == "Coke")
            return COKE_PRICE;
        else if (this.name == "Sprite")
            return SPRITE_PRICE;
        else return null;
    }
}
