package rpg.item;

public class Pistola extends ArmaFogo{
    
    public Pistola(int cost, int maxBull) {
        super("Pistola", cost, maxBull);
    }
    
    public Pistola(int maxBull) {
        super("Pistola", 200, maxBull);
    }
    
    public Pistola() {
        super("Pistola", 200);
    }
}
