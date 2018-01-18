package rpg.item;

public class Bala2 extends Bala{

    public Bala2() {
        super("Bala Tipo 2", 6);
    }

    @Override
    protected int potencializeDamage(int dam) {
        return 3 * dam;
    }

    @Override
    protected int decrementDefense(int def) {
        return def / 4;
    }
    
}
