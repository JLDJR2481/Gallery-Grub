package edu.craptocraft.gallerygrub.extras;

import java.util.Optional;

import edu.craptocraft.gallerygrub.order.Comanda;

public abstract class Extra {

    Optional<Extra> nextExtra = Optional.ofNullable(null);

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.of(nextExtra);
    }

    public abstract void sumExtras(Comanda order);

}
