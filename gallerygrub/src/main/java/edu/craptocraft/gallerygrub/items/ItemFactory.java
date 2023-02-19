package edu.craptocraft.gallerygrub.items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private static final Map<String, Item> itemMap = new HashMap<String, Item>();

    public static Item getItem(String name, double price) {

        itemMap.putIfAbsent(name, new Item(name, price));
        return itemMap.get(name);

    }

    static int size() {
        return itemMap.size();
    }

    static void clear() {
        itemMap.clear();
    }

}
