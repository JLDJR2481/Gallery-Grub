package edu.craptocraft.gallerygrub.order;

import org.junit.Test;

import static org.junit.Assert.*;

import edu.craptocraft.gallerygrub.items.Item;

public class ItemTest {

    @Test
    public void constructorTest() {
        Item item = new Item("Krabby Patty", 1.25);
        assertNotNull(item);
    }

    @Test
    public void nameTest() {
        Item item = new Item("Krabby Patty", 1.25);
        assertNotNull(item);
        assertEquals("Krabby Patty", item.name());

    }

    @Test
    public void priceTest() {
        Item item = new Item("Krabby Patty", 1.25);
        assertNotNull(item);
        assertEquals(1.25, item.price(), 0);

    }

}
