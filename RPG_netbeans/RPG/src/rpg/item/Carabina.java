package rpg.item;

public class Carabina extends ArmaFogo {
    
    public Carabina(int cost, int maxBull) {
        super("Carabina", cost, maxBull);
    }
    
    public Carabina(int maxBull) {
        super("Carabina", 200, maxBull);
    }
    
    public Carabina() {
        super("Carabina", 200);
    }
}
