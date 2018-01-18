package rpg.negocios;

import rpg.item.Mochila;
import util.Atributo;

public class Vendedor extends Negociante{
    private Atributo<String> name;
    private Atributo<Integer> money;
    private Mochila bol;
    
    public Vendedor(String name, int money){
        this.name = new Atributo<>(name);
        this.money = new Atributo<>(money);
        bol = new Mochila(25);
    }
    
    public Mochila getBol() {
        return bol;
    }

    public void setBol(Mochila bol) {
        this.bol = bol;
    }
    
    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name.setValue(name);
    }

    @Override
    public int getMoney() {
        return money.getValue();
    }

    @Override
    public void setMoney(int money) {
        this.money.setValue(money);
    }   
}
