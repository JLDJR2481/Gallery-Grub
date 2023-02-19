package edu.craptocraft.gallerygrub.order;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.gallerygrub.items.Item;
import edu.craptocraft.gallerygrub.items.ItemFactory;

public class Order implements Comanda {

    private final List<Item> items = new ArrayList<Item>();
    private Double total = 0d;

    public Order() {
    };

    @Override
    public void addItem(String name, double price) {

        Item item = ItemFactory.getItem(name, price);
        this.items.add(item);

    }

    @Override
    public void display() {
        System.out.println("\n\t --- ORDER --- \n");

        items.stream().forEach(this::itemDisplay);
    }

    private void itemDisplay(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }

}
