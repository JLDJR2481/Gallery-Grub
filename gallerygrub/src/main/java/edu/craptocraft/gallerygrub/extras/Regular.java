package edu.craptocraft.gallerygrub.extras;

import java.util.Optional;

import edu.craptocraft.gallerygrub.order.Comanda;
import edu.craptocraft.gallerygrub.items.Item;

public class Regular extends Extra {

    public Regular() {
    };

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> sumRegularPrices = order.itemList().stream().map(Item::price).reduce(Double::sum);

        if (sumRegularPrices.isPresent()) {
            order.updateTotal(sumRegularPrices.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));
    }

}
