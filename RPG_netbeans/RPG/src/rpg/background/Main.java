package rpg.background;

import rpg.item.ArmaFogo;
import rpg.item.Factory;
import rpg.item.Fuzil;
import rpg.personagens.Personagem;
import rpg.personagens.Player;

public class Main {
    public static void main(String[] args){
        Factory f = new Factory();
        Personagem p = new Player("José");
        p.setArma(f.carabina());
        ArmaFogo af = (ArmaFogo) p.getArma();
        af.setBala(f.bala1());
        System.out.println(af.getName()+ " " + " " + af.getBala().getName());
        p.setArma(f.fuzil());
        af = (Fuzil) p.getArma();
        af.setBala(f.bala2());
        System.out.println(af.getName()+ " " + " " + af.getBala().getName());
        af.setBala(f.bala1());
        System.out.println(af.getName()+ " " + " " + af.getBala().getName());
        p.getMoc().inserir(f.buchadaDeBode());
        p.getMoc().list();
    }
}
