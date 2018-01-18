package rpg.item;

import util.Atributo;

public class Usavel extends Item{
    
    public Usavel(String name, int cost){
        super(name, cost);
    }
    
    public Atributo<Object> bonus(Atributo<Object> atr, Object bonus){
        atr.setValue(bonus);
        return atr;
    }
}
