package rpg.item;

import rpg.personagens.Personagem;

public class ArmaFogo extends Arma implements Fogo {
    int bullets;

    public ArmaFogo(Personagem p, String name, int cost, int bullets) {
        super(p, name, cost);
        this.bullets = bullets;
    }
    @Override
    public void shoot(Personagem target, int userDam, int userXp) {
        target.setLife((int) ((this.getDam() + 0.5 * userDam) * (this.getXp() + 0.01 * userXp))); 
    }
    
    @Override
    public void ferir(Personagem target, int dam, int xp) {
        shoot(target, dam, xp);
    }
}
