package rpg.personagens;

import rpg.item.Mochila;
import rpg.item.Arma;

public abstract class Personagem {
    private int life, xp, dam, dex, money;
    private String state, name;
    private int nivel;
    private Arma a;
    private Mochila moc;
    
    /* Lista de números de xp que o usuário de atingir
    para passar de fase. */
    private final static int[] u = {10, 20, 30, 50, 80, 130}; 
    public Personagem(String name, int xp, Arma a){
        this.life = 150;
        this.xp = xp;
        this.dam = (int)( 10 * xp + 0.5 * (1 + life));
        this.name = name;
        this.money = 2000;
        this.a = a;
        this.moc = new Mochila(10);
    }
    
    abstract void atacar(Personagem target);
    protected void defender(Personagem from){
        this.setLife((int)(this.getLife() + 0.1 * from.xp + from.dam));
    }
    
    public void initPersonagem(){
        nivel = 1;
        if(this.life > 150)
            this.life = 150;
        if(this.life <= 50 && this.life > 0)
            state = "ferido";
        else if(this.life == 0)
            this.state = "morto";
        else
            this.state = "vivo";
        for(Integer i : u)
            if(this.getXp() == u[i])
                    this.setLevel(i + 1);
    }
    
    public String getState(){
        return this.state;
    }
    public void setState(String state){
        this.state = state;
    }
    public int getLevel(){
        return this.nivel;
    }
    public void setLevel(int level){
        this.nivel = level;
    }
    public int getLife(){
        return this.life;
    }
    public void setLife(int life){
        this.life = life;
    }
    public int getXp(){
        return this.xp;
    }
    public void setXp(int xp){
        this.xp = xp;
    }
    public int getDam(){
        return this.dam;
    }
    public void setDam(int dam){
        this.dam = dam;
    }
    public int getDex(){
        return this.dex;
    }
    public void setDex(int dex){
        this.dex = dex;
    }
    public int getMoney(){
        return this.money;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public Arma getArma() {
        return a;
    }
    public void setArma(Arma a) {
        this.a = a;
    }
    
}
