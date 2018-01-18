package util;

public class Atributo<T> {
    private T value;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T atributo) {
        this.value = atributo;
    }
    
    public Atributo(T value, String name){
        this.value = value;
        this.name = name;
    }
    
    public Atributo(T value){
        this.value = value;
    }
}
