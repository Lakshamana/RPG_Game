package rpg.personagens;

import util.UtilAlg;

public class BasicEnemyIA implements EnemyIA {

    private Personagem enemy;
    @Override
    public boolean deveAtacar() {
        return enemy.getCanAtk() && enemy.getState().equals("vivo");
    }

    @Override
    public void performAtaque(Personagem target) {
        if(deveAtacar()){
           target.setLife((int)(target.getLife() - (10  + enemy.getDam() / 10))); 
        }
    }

    public Personagem getEnemy() {
        return enemy;
    }
}
