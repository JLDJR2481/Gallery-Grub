package edu.craptocraft.gallerygrub.order;

import edu.craptocraft.gallerygrub.items.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order implements Comanda {

    private List<Item> items = new ArrayList<Item>();
    private Double total;

    public Order() {
    };

    public void addItem(String name, Double price) {

        Item item = new Item(name, price);
        items.add(item);

    }

    public void addItem(String name, Double price, String extra) {
        Item item = new Item(name, price, extra);
        items.add(item);

    }

    public int size() {
        return this.items.size();
    }

    public List<Item> itemList() {
        return Collections.unmodifiableList(this.items);
    }

    public Double getTotal() {
        return itemList().stream().filter(i -> i.price() > 0.0).mapToDouble(i -> i.price()).sum();
    }

    public void updateTotal(Double realTotal) {
        this.total = getTotal() + realTotal;
    }

    public void display() {

        System.out.print("\n\t --- ORDER --- \n");
        itemList().stream().forEach(this::itemDisplay);

    }

    private void itemDisplay(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    }

}
