package rpg.item;

abstract class Item {
    int cost, quant;
    String name;
    
    public void setCost(int cost){
        this.cost = cost;
    }
    public int getCost(){
        return this.cost;
    }
    public void setQuant(int quant){
        this.quant = quant;
    }
    public int getQaunt(){
        return this.quant;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
