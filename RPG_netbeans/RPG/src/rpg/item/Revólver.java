package rpg.item;

public class Revólver extends ArmaFogo {
    
    public Revólver(int cost, int maxBull) {
        super("Revólver", cost, maxBull);
    }
    
    public Revólver(int maxBull) {
        super("Revólver", 200, maxBull);
    }
    
    public Revólver() {
        super("Revólver", 200);
    }
}
