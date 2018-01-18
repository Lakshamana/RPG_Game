package rpg.item;

import flyweight.GlyphFactory;

public class Factory {
    GlyphFactory g = new GlyphFactory();
    
    public Factory(){
        g.put(new ArmaBranca("Peixeira", 100));
        g.put(new Usavel("Buchada de Bode", 10));
        g.put(new Bala1());
        g.put(new Bala2());
        g.put(new Carabina());
        g.put(new Fuzil());
        g.put(new Pistola());
        g.put(new Revólver());
        g.put(new Revólver());
    }
    
    public Carabina carabina(){
        return (Carabina)g.get("Carabina");
    }
    
    public Fuzil fuzil(){
        return (Fuzil)g.get("Fuzil");
    }
    
    public Pistola pistola(){
        return (Pistola)g.get("Pistola");
    }
    
    public Revólver revolver(){
        return (Revólver)g.get("Revólver");
    }
    
    public ArmaBranca peixeira(){
        return (ArmaBranca)g.get("Peixeira");
    }
    
    public Bala1 bala1(){
        return (Bala1)g.get("Bala Tipo 1");
    }
    
    public Bala2 bala2(){
        return (Bala2)g.get("Bala Tipo 2");
    }
    
    public Usavel buchadaDeBode(){
        return (Usavel)g.get("buchada de bode");
    }

    public GlyphFactory getG() {
        return g;
    }
}
