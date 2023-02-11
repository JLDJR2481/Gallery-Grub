package edu.craptocraft.gallerygrub.items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private final static Map<String, Item> itemMap = new HashMap<String, Item>();

    public ItemFactory() {
    };

    public static Item getItem(String name, Double price) {
        itemMap.putIfAbsent(name, new Item(name, price));
        return itemMap.get(name);
    }

    public static Item getItem(String name, Double price, String extra) {
        itemMap.putIfAbsent(name + " w/ " + extra, new Item(name, price, extra));

        return itemMap.get(name + " w/ " + extra);
    }

    static int size() {
        return itemMap.size();
    }

    public static void clear() {
        itemMap.clear();
    }

}
