package edu.craptocraft.gallerygrub.order;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PricesTest {

    Map<String, Double> prices = new HashMap<>();

    @Test
    public void init_pricesTest() {

        prices.put("cheese", 0.25);
        prices.put("sauce", 0.50);
        prices.put("medium", 0.25);
        prices.put("large", 0.50);

        assertNotNull(prices);
        assertEquals(4, prices.size());

    }

}
