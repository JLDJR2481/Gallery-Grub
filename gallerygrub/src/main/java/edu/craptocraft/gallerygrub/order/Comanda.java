package edu.craptocraft.gallerygrub.order;

import java.util.List;

import edu.craptocraft.gallerygrub.items.Item;

public interface Comanda {

    void addItem(String name, Double price);

    void addItem(String name, Double price, String extra);

    int size();

    List<Item> itemList();

    Double getTotal();

    void updateTotal(Double realTotal);

    void display();

}
