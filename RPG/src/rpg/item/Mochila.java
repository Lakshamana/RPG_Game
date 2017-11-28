package rpg.item;

import java.util.ArrayList;

public class Mochila {
    private final int max;
    private int q;
    private ArrayList<Item> itens;
    
    public Mochila(int max){
        this.max = max;
        itens = new ArrayList<>(max);
        q = 0;
    }
    
    public boolean add(Item e){
        if(q <= max){
            itens.add(e);
            q++;
            return true;
        }
        System.out.println("A bolsa já está cheia!");
        return false;
    }
    
    public boolean exists(Item e){
        for(Item i : this.itens)
            if(i.equals(e))
                return true;
        return false;
    }
    
    public boolean rmv(int i){
        if(q < 0 && exists(itens.get(i))){
            System.out.println("A sua bolsa já está vazia!");
            return false;
        }
        itens.remove(i);
        q--;
        return true;
    }
    
    public void showItens(){
        for(int i = 0; i < itens.size(); i++)
            System.out.println(i + ". " + itens.get(i).toString());
    }
    
    public Mochila getMochila(){
        return this;
    }
    
    public int getQ() {
        return q;
    }
}
