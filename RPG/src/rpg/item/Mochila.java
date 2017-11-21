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
        if(q > max){
            itens.add(e);
            q++;
            return true;
        }
        return false;
    }
    public boolean rmv(int i){
        if(q < 0){
            System.out.print("Mochila já está vazia");
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
