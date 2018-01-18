package rpg.personagens;

public class Player extends Personagem {
    public Player(String name){
        super(name);
    }
    
    @Override
    protected void atacar(Personagem target){
        this.getArma().ferir(target, this.getDam(), this.getXp());
        super.atacar(target);
        Inimigo in = new Inimigo(getName(), getXp());
    }
    
    @Override
    protected void defender(Personagem from){
        super.defender(from);
    }

    void initPlayer(){
        super.initPersonagem();
    }
}
