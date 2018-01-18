package rpg.item;

import flyweight.Glyph;
import util.Atributo;

public abstract class Item implements Glyph{
    private Atributo<Integer> cost;
    private Atributo<String> name;
    
    public Item(String name, int cost){
        this.cost = new Atributo<>(cost);
        this.name = new Atributo<>(name);
    }
    
    public void setCost(int cost){
        this.cost.setValue(cost);
    }
    
    public int getCost(){
        return this.cost.getValue();
    }
    
    public void setName(String name){
        this.name.setValue(name);
    }
    
    @Override
    public String getName(){
        return this.name.getValue();
    }
}
