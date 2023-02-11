package edu.craptocraft.gallerygrub.receipt;

import edu.craptocraft.gallerygrub.extras.Extra;
import edu.craptocraft.gallerygrub.order.Comanda;
import edu.craptocraft.gallerygrub.order.Order;

public class Receipt implements Ticket {

    private Comanda order = new Order();
    private Double total = 0d;
    private Extra actualExtra;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    public Double total() {
        return order.getTotal();
    }

    public void setChain(Extra extraType) {
        this.actualExtra = extraType;
    }

    public Extra getChain() {
        return this.actualExtra;
    }

    public void sumExtrasCharge() {
        if (this.actualExtra != null) {
            this.actualExtra.sumExtras(this.order);
        }

    }

    public void print() {

        this.getOrder().display();
        System.out.print("\tTOTAL --------> " + this.total + "$\n");

    }

}
