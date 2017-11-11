package rpg.personagens;


public class Player extends Personagem {
    public Player(int life, int xp, int dam, String name,
            int dex, int money, String state, int nivel){
        super(life, xp, dam, name, dex, money, state, nivel);
    }
    
    @Override
    void atacar(Personagem target){
        target.life -= 0.1 * this.xp + this.dam;
    }
    
    @Override
    void defender(Personagem fromEnemy){
        this.life += 0.1 * fromEnemy.xp + fromEnemy.dam;
    }

    void initPlayer(Personagem p){
        super.initPersonagem(p);
    }
    
    @Override
    public String getState(){
        return super.getState();
    }
    
    @Override
    public int getLevel(){
        return super.getLevel();
    }
}
