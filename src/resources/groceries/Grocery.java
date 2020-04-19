package resources.groceries;

import resources.groceries.grocerie.Juice;
import resources.groceries.grocerie.Snack;
import resources.groceries.grocerie.Soda;

public class Grocery {
    private Snack snack;
    private Soda soda;
    private Juice juice;

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public Soda getSoda() {
        return soda;
    }

    public void setSoda(Soda soda) {
        this.soda = soda;
    }

    public Juice getJuice() {
        return juice;
    }

    public void setJuice(Juice juice) {
        this.juice = juice;
    }
}
