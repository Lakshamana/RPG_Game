package rpg.negocios;

import rpg.item.Item;
import rpg.item.Mochila;
import util.Atributo;

public abstract class Negociante {
    
    BankBehavior bh = new BasicCV();
    private Mochila moc = new Mochila(20);
    private Atributo<Integer> money;
    
    private boolean podeComprar(Item item){
        return getMoney() <= item.getCost();
    }
    
    private boolean podeVender(Item item){
        return getMoc().existe(item);
    }
    
    public void realizarVenda(Negociante c, Item item){
        if(podeVender(item) && c.podeComprar(item)){
            bh.vender(c, item);
            bh.comprar(this, item);
        } else System.err.println("Erro na venda!");
    }
    
    public void realizarCompra(Negociante v, Item item){
        if(podeComprar(item) && v.podeComprar(item)){
            bh.comprar(this, item);
            bh.vender(v, item);
        } else System.err.println("Erro na venda!");
    }
    
    public int getMoney(){
        return this.money.getValue();
    }
    
    public void setMoney(int money){
        this.money.setValue(money);
    }
    
    public Mochila getMoc() {
        return moc;
    }
}
