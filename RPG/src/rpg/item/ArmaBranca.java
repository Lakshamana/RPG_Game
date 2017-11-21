package rpg.item;

import rpg.personagens.Personagem;

public class ArmaBranca extends Arma{
    
    public ArmaBranca(Personagem p, String name, int cost) {
        super(p, name, cost);
    }

    @Override
    public void ferir(Personagem target, int userDam, int userXp) {
        target.setLife((int) ((this.getDam() + 0.5 * userDam) * (this.getXp() + 0.01 * userXp))); 
    }
    
}
