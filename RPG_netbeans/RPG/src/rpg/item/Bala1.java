package rpg.item;

public class Bala1 extends Bala {

    public Bala1() {
        super("Bala Tipo 1", 4);
    }

    @Override
    public int potencializeDamage(int dam) {
        return 2 * dam;
    }

    @Override
    public int decrementDefense(int def) {
        return 2 * def / 3;
    }
    
}
