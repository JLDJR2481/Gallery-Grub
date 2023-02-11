package edu.craptocraft.gallerygrub.extras;

import edu.craptocraft.gallerygrub.order.Comanda;

public class SauceExtra extends Extra {

    private Double SAUCE_PRICE = 0.50d;

    public SauceExtra() {
        extraProduct = SAUCE;
    }

    @Override
    public void sumExtras(Comanda comanda) {
        comanda.itemList().stream().filter(item -> item.extra() == extraProduct);

        comanda.updateTotal(SAUCE_PRICE);

        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(comanda));
    }

}
