package rpg.negocios;

import rpg.item.Item;

public interface BankBehavior {
    public void comprar(Negociante vendedor, Item item);
    public void vender(Negociante comprador, Item item);
}
