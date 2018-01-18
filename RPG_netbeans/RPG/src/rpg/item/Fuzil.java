package rpg.item;

public class Fuzil extends ArmaFogo {
    
    public Fuzil(int cost, int maxBull) {
        super("Fuzil", cost, maxBull);
    }
    
    public Fuzil(int maxBull) {
        super("Fuzil", 200, maxBull);
    }
    
    public Fuzil() {
        super("Fuzil", 200);
    }
}
