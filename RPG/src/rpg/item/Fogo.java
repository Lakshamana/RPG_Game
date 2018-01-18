package rpg.item;

import rpg.personagens.Personagem;

public interface Fogo {
    boolean shoot(Personagem target, int dam);
    
    void recarregar();
}
