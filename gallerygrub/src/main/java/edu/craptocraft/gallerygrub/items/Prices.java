package edu.craptocraft.gallerygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {

    static Map<String, Double> prices = new HashMap<>();

    public Prices() {
    };

    public static void init_prices() {
        prices.put("cheese", 0.25);
        prices.put("sauce", 0.50);
        prices.put("medium", 0.25);
        prices.put("large", 0.50);
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
