package rpg.personagens;

public class Inimigo extends Personagem{
    public Inimigo(int life, int xp, int dam, String name,
            int dex, int money, String state, int nivel){
        super(life, xp, dam, name, dex, money, state, nivel);
    }
    
    @Override
    void atacar(Personagem target){
        target.life -= 0.1 * this.xp + this.dam;
    }
    
    @Override
    void defender(Personagem fromPlayer){
        this.life += 0.1 * this.dex + xp;
    }
}
