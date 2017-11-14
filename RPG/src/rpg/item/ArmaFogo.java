package rpg.item;

import rpg.personagens.Personagem;

public class ArmaFogo extends Arma implements Fogo {
    int nBullets;
    @Override
    public void shoot(Personagem target, int userDam, int userXp) {
        target.setLife((int) ((dam + 0.5 * userDam) * (xp + 0.01 * userXp))); 
    }

    @Override
    public void ferir(Personagem target, int dam, int xp) {
        shoot(target, dam, xp);
    }
    
}
