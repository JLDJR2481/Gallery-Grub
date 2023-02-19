package edu.craptocraft.gallerygrub.items;

public class Item implements Product {

    String name = "";
    Double price = 0d;
    String extra = "";

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;

    }

    public Item(String name, Double price, String extra) {
        this.name = name + " w/ " + extra;
        this.price = price;
        this.extra = extra;

    }

    public String name() {
        return this.name;
    }

    public Double price() {
        return this.price;
    }

    public String extra() {
        return this.extra;
    }

    public boolean isRegular() {
        return this.extra().isBlank();
    }

    @Override
    public String toString() {
        return Prices.contains(this.extra())
                ? this.name + "...." + String.format("%.2f", this.price) + "$" + " + "
                        + String.format("%.2f", Prices.getPrice(this.extra())) + "$"
                : this.name + "...." + String.format("%.2f", this.price) + "$";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            return this.name.equals(((Item) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
