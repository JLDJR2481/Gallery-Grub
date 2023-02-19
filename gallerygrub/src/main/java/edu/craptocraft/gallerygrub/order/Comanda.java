package edu.craptocraft.gallerygrub.order;

import java.util.List;

import edu.craptocraft.gallerygrub.items.Item;

public interface Comanda {

    void addItem(String name, double price);

    void addItem(String name, double price, String extra);

    List<Item> itemList();

    int size();

    Double getTotal();

    void updateTotal(Double total);

    void display();
}
