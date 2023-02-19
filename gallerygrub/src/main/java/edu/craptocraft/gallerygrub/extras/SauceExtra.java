package edu.craptocraft.gallerygrub.extras;

import java.util.Optional;

import edu.craptocraft.gallerygrub.order.Comanda;

public class SauceExtra extends Extra {

    public SauceExtra() {
    };

    @Override
    public void sumExtras(Comanda order) {

        Optional<Double> sauceCharge = order.itemList().stream()
                .filter(item -> item.extra().equalsIgnoreCase(Extras.SAUCE.name())).map(item -> Extras.SAUCE.getPrice())
                .reduce(Double::sum);

        if (sauceCharge.isPresent()) {
            order.updateTotal(sauceCharge.get());
        }

        this.nextExtra.ifPresent(chain -> chain.sumExtras(order));

    }

}
