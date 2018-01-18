package rpg.negocios;

import rpg.item.Item;

public class BasicCV implements BankBehavior{

    @Override
    public void comprar(Negociante v, Item item) {
        v.getMoc().remover(item);
        v.setMoney(v.getMoney() - item.getCost());
    }

    @Override
    public void vender(Negociante c, Item item) {
        c.getMoc().inserir(item);
        c.setMoney(c.getMoney() + item.getCost());
    }
}
