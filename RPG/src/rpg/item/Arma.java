package rpg.item;

import rpg.personagens.Personagem;

abstract class Arma {
    String nome;
    int dam;
    
    abstract void ferir(Personagem target, int dam, int xp);
}
