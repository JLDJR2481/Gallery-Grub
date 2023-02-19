package edu.craptocraft.gallerygrub.receipt;

import edu.craptocraft.gallerygrub.order.Comanda;
import edu.craptocraft.gallerygrub.extras.Extra;

public interface Ticket {

    Comanda getOrder();

    void setChain(Extra extra);

    Double total();

    void print();

}
