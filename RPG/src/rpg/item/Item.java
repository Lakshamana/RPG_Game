package rpg.item;

import java.util.ArrayList;
import rpg.personagens.Personagem;

public abstract class Item {
    protected int cost;
    protected String name;
    protected Personagem p;
    
    public Item(String name, int cost){
        this.cost = cost;
        this.name = name;
    }
    
    public void setCost(int cost){
        this.cost = cost;
    }
    public int getCost(){
        return this.cost;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setPersonagem(Personagem p){
        this.p = p;
    }
    public Personagem getPersonagem(){
        return this.p;
    }
}
