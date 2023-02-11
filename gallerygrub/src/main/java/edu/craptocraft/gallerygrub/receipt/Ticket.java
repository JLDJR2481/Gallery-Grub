package edu.craptocraft.gallerygrub.receipt;

import edu.craptocraft.gallerygrub.extras.Extra;
import edu.craptocraft.gallerygrub.order.Comanda;

public interface Ticket {

    Comanda getOrder();

    void setChain(Extra extra);

    Double total();

    Extra getChain();

    void print();
}
