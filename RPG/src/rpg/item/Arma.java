package rpg.item;

import rpg.personagens.Personagem;

abstract class Arma extends Item {
    int dam, xp;
    
    public abstract void ferir(Personagem target, int dam, int xp);
}
