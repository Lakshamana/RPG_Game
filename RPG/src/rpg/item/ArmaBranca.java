package rpg.item;

import rpg.personagens.Personagem;

public class ArmaBranca extends Arma{

    @Override
    public void ferir(Personagem target, int userDam, int userXp) {
        target.setLife((int) ((dam + 0.5 * userDam) * (xp + 0.01 * userXp))); 
    }
    
}
