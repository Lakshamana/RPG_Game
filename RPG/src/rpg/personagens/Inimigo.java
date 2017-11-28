package rpg.personagens;

import rpg.item.Arma;

public class Inimigo extends Personagem{
    Player p;
    public Inimigo(String name, int xp, Arma a){
        super(name, xp, a);
    }
    
    public Inimigo(String name, int xp, Arma a, int nivel){
        super(name, xp, a);
        super.setLevel(p.getLevel());
    }
    
    @Override
    protected void atacar(Personagem target){
        target.setLife((int)(target.getLife() - 0.1 * this.getXp() + this.getDam()));
        super.atacar(target);
    }
    
    @Override
    protected void defender(Personagem from){
        super.defender(from);
    }
    
    void initInimigo(){
        super.initPersonagem();
    }
}
