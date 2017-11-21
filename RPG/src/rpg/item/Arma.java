package rpg.item;

import rpg.personagens.Personagem;

public abstract class Arma extends Item {
    private int dam, xp;

    public Arma(Personagem p, String name, int cost){
        super(p, name, cost);
    }
    public abstract void ferir(Personagem target, int dam, int xp);
    
    public int getDam() {
        return dam;
    }
    public void setDam(int dam) {
        this.dam = dam;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
}
