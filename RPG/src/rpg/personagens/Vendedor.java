package rpg.personagens;

import rpg.item.Item;
import rpg.item.Mochila;

public class Vendedor {
    private String name;
    private int money;
    private Mochila bol;
    
    public Vendedor(String name){
        this.name = name;
        bol = new Mochila(15);
    }
        
    public boolean receber(Personagem p, Item item){
        if(getMoney() <= item.getCost() && p.getMoc().exists(item)){
            money -= item.getCost();
            return true;
        }
        return false;
    }
    
    public boolean repassar(Item item){
        if(getBol().exists(item)){
            money += item.getCost();
            return true;
        }
        return false;
    }
    
    public Mochila getBol() {
        return bol;
    }

    public void setBol(Mochila bol) {
        this.bol = bol;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
}
