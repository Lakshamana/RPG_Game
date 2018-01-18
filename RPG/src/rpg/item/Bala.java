package rpg.item;

public abstract class Bala extends Usavel{

    public Bala(String name, int cost) {
        super(name, cost);
    }
    
    protected abstract int potencializeDamage(int dam);
    
    protected abstract int decrementDefense(int def);
}
