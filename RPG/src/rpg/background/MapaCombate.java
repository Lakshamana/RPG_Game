package rpg.background;

import rpg.personagens.Personagem;
import rpg.personagens.Vendedor;

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
        }
    }
    
    public class MapaCaatinga extends MapaCombate{
        public MapaCaatinga(){
            super(player, enemy, v);
            name = "Caatinga";
            /*Favorecimentos aos cangaceiros
            e demais construções.
            */
        }
    }
    
    public class MapaCidade extends MapaCombate{
        public MapaCidade(){
            super(player, enemy, v);
            name = "Cidade"; 
            /*Favorecimentos e desfavorecimentos à polícia e os cangaceiros.
            talvez os produtos que o vendedor dessa cidade vende 
            sejam mais caros, ou outras coisas...
            e demais construções.
            */
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
