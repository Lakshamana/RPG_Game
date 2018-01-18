package rpg.personagens;

public class Inimigo extends Personagem{
    private Player p;
    private EnemyIA atkBehavior;
    public Inimigo(String name){
        super(name);
    }
    
    public Inimigo(String name, int nivel){
        super(name);
        super.setLevel(p.getLevel());
    }
    
    @Override
    protected void atacar(Personagem target){
        atkBehavior.performAtaque(target);
        super.atacar(target);
    }
    
    @Override
    protected void defender(Personagem from){
        super.defender(from);
    }

    public Player getP() {
        return p;
    }
    
    void initInimigo(){
        super.initPersonagem();
    }
}
