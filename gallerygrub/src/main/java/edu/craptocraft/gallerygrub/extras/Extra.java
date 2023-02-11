package edu.craptocraft.gallerygrub.extras;

import java.util.Optional;

import edu.craptocraft.gallerygrub.order.Comanda;

public abstract class Extra {

    static String CHEESE = "cheese";
    static String SAUCE = "sauce";
    static String SIZE_LARGE = "size large";

    Optional<Extra> nextExtra = Optional.empty();
    String extraProduct;

    public Extra() {
    };

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.of(nextExtra);
    }

    public abstract void sumExtras(Comanda order);

}
