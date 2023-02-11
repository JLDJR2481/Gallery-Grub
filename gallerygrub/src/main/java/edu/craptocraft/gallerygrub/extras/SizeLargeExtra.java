package edu.craptocraft.gallerygrub.extras;

import java.util.List;

import edu.craptocraft.gallerygrub.order.Comanda;
import edu.craptocraft.gallerygrub.items.Item;

public class SizeLargeExtra extends Extra {

    private Double SIZE_PRICE = 0.50d;

    public SizeLargeExtra() {
        extraProduct = SIZE_LARGE;
    }

    @Override
    public void sumExtras(Comanda comanda) {

        List<Item> items = comanda.itemList();

        comanda.updateTotal(SIZE_PRICE);

        for (Item item : items) {
            if (item.extra() == extraProduct) {
                comanda.updateTotal(SIZE_PRICE);
            }

        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(comanda));
    }

}
