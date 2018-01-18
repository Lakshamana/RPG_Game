package rpg.item;

import java.util.ArrayList;
import util.Atributo;
import util.IPacote;

public class Mochila implements IPacote<Item>{
    private final int max;
    private int q;
    private Atributo<Integer> quant;
    private ArrayList<Item> itens;
    
    public Mochila(int max){
        this.max = max;
        itens = new ArrayList<>(max);
        quant = new Atributo<>(q = 0, "quant");
    }
    
    @Override
    public void inserir(Item e){
        if(q <= max){
            itens.add(e);
            quant.setValue(++q);
            System.out.println("Item " + e.getName() + " inserido!");
        }else System.err.println("A bolsa já está cheia!");
    }
    
    @Override
    public boolean existe(Item e){
        for(Item i : this.itens)
            if(i.equals(e))
                return true;
        return false;
    }
    
    @Override
    public void remover(Item e){
        if(!existe(e))
            System.err.println("Item não existe na mochila! Escolha outro.");
        itens.remove(e);
        quant.setValue(--q);
        System.out.println("Item " + e.getName() + " removido!");
    }
    
    @Override
    public void list(){
        String name;
        for(int i = 0; i < itens.size(); i++){
            name = itens.get(i).getName();
            System.out.println((i + 1) + ". " + name);
        }  
    }

    @Override
    public ArrayList<Item> getAll() {
        return itens;
    }
    
    @Override
    public Item get(Item item){
        return (existe(item)) ? item : null;
    }
    
    public int getQ() {
        return q;
    }

    @Override
    public Item getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(Item e, Object newValue) {
        if(existe(e))
            itens.set(itens.indexOf(e), (Item)newValue);
    }

    @Override
    public void setByName(String name, Object newValue) {
        String currentName;
        for(Item e : itens){
            currentName = e.getName();
            if(currentName.equals(name)){
                itens.set(itens.indexOf(e), (Item)newValue);
                return;
            }
        }
    }
}

