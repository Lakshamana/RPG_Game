package rpg.background;

import java.util.ArrayList;
import rpg.item.Item;
import rpg.personagens.Personagem;
import rpg.negocios.Vendedor;

public class MapaCombate {
    private MapaCombate mapa;
    private String name;
    private Vendedor v;
    private Personagem player;
    private Personagem enemy;
    
    public MapaCombate(Personagem player, Personagem enemy, 
            Vendedor v){
        this.player = player;
        this.enemy = enemy;
        this.v = v;
    }
    
    public class MapaDelegacia extends MapaCombate{
        public MapaDelegacia(){
            super(player, enemy, v);
            name = "Delegacia";
            enemy.setDam((int)(1.2 * enemy.getDam()));
        }
    }
    
    public class MapaCaatinga extends MapaCombate{
        public MapaCaatinga(){
            super(player, enemy, v);
            name = "Caatinga";
            player.setDam((int)(1.2 * player.getDam()));
        }
    }
    
    public class MapaCidade extends MapaCombate{
        public MapaCidade(){
            super(player, enemy, v);
            name = "Cidade"; 
            ArrayList<Item> list = v.getBol().getAll();
            for(Item e : list)
                e.setCost((int)(1.2 * e.getCost()));
            //adicionar outros depois...
        }
    }

    public MapaCombate getMapa(){
        return mapa;
    }

    public void setMapa(MapaCombate mapa){
        this.mapa = mapa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
