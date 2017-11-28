package rpg.personagens;

import rpg.item.Arma;


public class Player extends Personagem {
    public Player(int xp, String name, Arma a){
        super(name, xp, a);
    }
    
    @Override
    protected void atacar(Personagem target){
        this.getArma().ferir(target, this.getDam(), this.getXp());
        super.atacar(target);
    }
    
    @Override
    protected void defender(Personagem from){
        super.defender(from);
    }

    void initPlayer(){
        super.initPersonagem();
    }
}
