package edu.craptocraft.gallerygrub.extras;

import java.util.Optional;

import edu.craptocraft.gallerygrub.order.Comanda;
import edu.craptocraft.gallerygrub.items.Item;

public class Regular extends Extra {

    public Regular() {
        extraProduct = null;
    };

    @Override
    public void sumExtras(Comanda comanda) {

        Optional<Double> regularSum = comanda.itemList().stream().map(Item::price).reduce(Double::sum);

        if (regularSum.isPresent()) {
            comanda.updateTotal(regularSum.get());
        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(comanda));
    }

}
