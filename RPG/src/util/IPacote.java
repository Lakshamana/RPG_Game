package util;

import java.util.ArrayList;


public interface IPacote<T> {
    void inserir(T e);
    
    void remover(T e);
    
    boolean existe(T e);
    
    ArrayList<T> getAll();
    
    void list();
    
    T get(T e);
    
    T getByName(String name);
    
    void set(T e, Object newValue);
    
    void setByName(String name, Object newValue);
}
