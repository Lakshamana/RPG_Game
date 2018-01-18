package rpg.item;

import rpg.personagens.Personagem;
import util.Atributo;

public abstract class Arma extends Item {
    private Atributo<Integer> xp, dam;
    private Atributo<String> name;

    public Arma(String name, int cost){
        super(name, cost);
        xp = new Atributo<>(20, "xp");
        dam = new Atributo<>(20, "dam");
        this.name = new Atributo<>(name, "name");
    }
    
    public abstract void ferir(Personagem target, int dam, int xp);
    
    public abstract void ferir(Personagem target, int dam);
    
    public int getDam() {
        return dam.getValue();
    }
    
    public void setDam(int dam) {
        this.dam.setValue(dam);
    }
    
    public int getXp() {
        return xp.getValue();
    }
    
    public void setXp(int xp) {
        this.xp.setValue(xp);
    }
}
