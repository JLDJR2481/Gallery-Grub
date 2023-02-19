package edu.craptocraft.gallerygrub.items;

public class Item implements Product {

    String name;
    Double price = 0d;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;

    }

    public String name() {
        return this.name;
    }

    public Double price() {
        return this.price;
    }

    @Override
    public String toString() {
        return name() + "...." + price() + "$";
    }

}
