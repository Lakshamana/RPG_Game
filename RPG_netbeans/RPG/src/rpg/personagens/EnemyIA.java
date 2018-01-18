package rpg.personagens;

public interface EnemyIA {
    boolean deveAtacar();
    
    void performAtaque(Personagem target);
}
