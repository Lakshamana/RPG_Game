package rpg.personagens;

import rpg.item.Arma;

public class Inimigo extends Personagem{
    public Inimigo(String name, int xp, Arma a){
        super(name, xp, a);
    }
    
    public Inimigo(String name, int xp, Arma a, int nivel){
        super(name, xp, a);
        super.setLevel(nivel);
    }
    
    @Override
    void atacar(Personagem target){
        target.setLife((int)(target.getLife() - 0.1 * this.getXp() + this.getDam()));
    }
    
    void initInimigo(){
        super.initPersonagem();
    }
}
