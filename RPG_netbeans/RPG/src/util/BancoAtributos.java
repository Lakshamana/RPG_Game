package util;

import java.util.ArrayList;

public class BancoAtributos implements IPacote<Atributo> {

    private ArrayList<Atributo> attrList = new ArrayList<>();
    
    @Override
    public void inserir(Atributo e) {
        if(!existe(e) || getByName(e.getName()) == null){
            attrList.add(e);
        }
        System.err.println("Atributo já existe ou candidato não tem nome.");
    }

    @Override
    public void remover(Atributo e) {
        if(existe(e))
            attrList.remove(e);
        System.err.println("Atributo não existe! Escolha outro.");
    }

    @Override
    public boolean existe(Atributo e) {
        for(Atributo atr : attrList)
            if(atr.equals(e))
                return true;
        return false;
    }

    @Override
    public ArrayList<Atributo> getAll() {
        return attrList;
    }

    @Override
    public void list(){
        String name;
        Object value;
        for(int i = 0; i < attrList.size(); i++){
            name = attrList.get(i).getName();
            value = attrList.get(i).getValue();
            System.out.println((i + 1) + ". " + name + " = " + value);
        }  
    }

    @Override
    public Atributo get(Atributo e) {
        return (existe(e)) ? e : null;
    }
    
    @Override
    public Atributo getByName(String name) {
        String currentName;
        for(Atributo atr : attrList){
            currentName = atr.getName();
            if(currentName.equals(name))
                return atr;  
        }
        return null;  
    }

    @Override
    public void set(Atributo e, Object newValue) {
        if(existe(e))
            attrList.set(attrList.indexOf(e), (Atributo)newValue);
    }

    @Override
    public void setByName(String name, Object newValue) {
        String currentName;
        for(Atributo atr : attrList){
            currentName = atr.getName();
            if(currentName.equals(name)){
                attrList.set(attrList.indexOf(atr), (Atributo)newValue);
                return;
            }
        }
    }
}
