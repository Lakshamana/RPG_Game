package flyweight;

import java.util.HashMap;
import rpg.item.Item;


public class GlyphFactory {
    private static final HashMap<String, Glyph> MAPA_ITENS = new HashMap<>();
    
    public Glyph put(Glyph item){
        return MAPA_ITENS.put(item.getName().toLowerCase(), item);
    }
    
    public Glyph get(String item){
        return MAPA_ITENS.get(item.toLowerCase());
    }
    
    public static final Glyph getItem(String name, Item tipo){
        Glyph item = MAPA_ITENS.get(name);
        if(item == null){
            item = tipo; //new filhoDeItem(...);
            MAPA_ITENS.put(name, item);
        }
        return item;
    }   
}
