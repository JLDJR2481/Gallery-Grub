package edu.craptocraft.gallerygrub.extras;

import java.util.List;

import edu.craptocraft.gallerygrub.items.Item;
import edu.craptocraft.gallerygrub.order.Comanda;

public class CheeseExtra extends Extra {

    private Double CHEESE_PRICE = 0.25d;

    public CheeseExtra() {
        extraProduct = CHEESE;
    };

    @Override
    public void sumExtras(Comanda comanda) {

        List<Item> items = comanda.itemList();
        items.stream().filter(item -> item.extra() == extraProduct);

        comanda.updateTotal(CHEESE_PRICE);

        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(comanda));
    }
}