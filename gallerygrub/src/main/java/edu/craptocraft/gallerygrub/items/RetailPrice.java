package edu.craptocraft.gallerygrub.items;

import java.util.Map;
import java.util.HashMap;

public class RetailPrice {

    static final Map<String, Double> prices = new HashMap<String, Double>();

    public RetailPrice() {
    };

    public static void init_prices() {
        prices.put("large", 0.50d);
        prices.put("sauce", 0.50d);
        prices.put("medium", 0.25d);
        prices.put("cheese", 0.25d);

    }

    static Double getPrice(String item) {
        return prices.get(item);
    }

    static boolean contains(String item) {
        return prices.containsKey(item);
    }

    public static void display() {

        prices.forEach((key, value) -> System.out.println("\t" + key + "=" + value));

    }

}
