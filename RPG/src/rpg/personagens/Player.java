package rpg.personagens;


public class Player extends Personagem {
    public Player(int life, int xp, int dam, String name,
            int dex, int money, String state, int nivel){
        super(life, xp, dam, name, dex, money, state, nivel);
    }
    
    @Override
    void atacar(Personagem target){
        
    }
    
    @Override
    void defender(Personagem fromEnemy){
        
    }

    void initPlayer(){
        super.initPersonagem();
    }
}
