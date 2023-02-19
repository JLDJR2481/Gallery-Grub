package edu.craptocraft.gallerygrub.receipt;

import edu.craptocraft.gallerygrub.order.Comanda;
import edu.craptocraft.gallerygrub.extras.Extra;

public class Receipt implements Ticket {

    private final Comanda order;
    private Double total = 0d;
    private Extra firstExtra;

    public Receipt(Comanda order) {
        this.order = order;
        this.total = order.getTotal();
    }

    public Comanda getOrder() {
        return this.order;
    }

    public void setChain(Extra extra) {
        this.firstExtra = extra;
    }

    public Double total() {
        if (this.total == 0d) {
            this.sumExtrasCharge();
            this.total = this.getOrder().getTotal();
        }
        return this.total;
    }

    void sumExtrasCharge() {
        if (this.firstExtra != null) {
            this.firstExtra.sumExtras(this.order);
        }
    }

    public void print() {
        this.getOrder().display();
        System.out.print("\tTOTAL --------> " + this.total + "$");
    }

}
