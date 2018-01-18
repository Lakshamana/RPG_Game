package util;

import rpg.personagens.Player;

public class SistemaNivel {
    
    public Player p;
    private int[] v = new int[] {100, 200, 300, 500};
    public void testarFasePlayer(int xpInimigo){
        p.setXp(p.getXp() + xpInimigo);
        for(int i = 0; i < v.length - 1; i++)
            if(v[i] <= p.getXp() && p.getXp() < v[i + 1] && p.getLevel() == i)
                p.levelUp();
    }
}
