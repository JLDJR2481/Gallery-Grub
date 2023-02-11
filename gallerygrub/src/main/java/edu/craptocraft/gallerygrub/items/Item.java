package edu.craptocraft.gallerygrub.items;

public class Item implements Product {

    String name;
    Double price;
    String extra;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {

        this.name = name + "w/ " + extra;
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
        return extra;
    }

    public Boolean isRegular() {
        return this.extra() == null;
    }

    @Override
    public String toString() {
        if (RetailPrice.contains(this.extra)) {
            String product = (this.name + " w/ " + this.extra + "...." + this.price + "$ + "
                    + RetailPrice.getPrice(this.extra) + "$");

            return product;

        } else {
            String product = (this.name + "...." + this.price + "$");
            return product;
        }

    }

    @Override
    public boolean equals(Object obj) {

        return (obj instanceof Item) ? this.name.equals(((Item) obj).name) : false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
