package rpg.personagens;

import rpg.item.Arma;


public class Player extends Personagem {
    public Player(int xp, String name, Arma a){
        super(name, xp, a);
    }
    
    @Override
    void atacar(Personagem target){
        this.getArma().ferir(target, this.getDam(), this.getXp());
    }

    void initPlayer(){
        super.initPersonagem();
    }
}
