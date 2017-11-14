package rpg.personagens;

public abstract class Personagem {
    int life, xp, dam, dex, money;
    String state, name;
    int nivel;
    Personagem enemy;
    
    /*Lista de números de xp que o usuário de atingir
    para passar de fase.*/
    protected final static int[] u = {10, 20, 30, 50, 80, 130}; 
    public Personagem(int life, int xp, int dam, String name,
            int dex, int money, String state, int nivel){
        this.life = life;
        this.xp = xp;
        this.dam = dam;
        this.dex = dex;
        this.money = money;
        this.state = state;
        this.nivel = nivel;
        this.name = name;
    }
    abstract void atacar(Personagem target);
    abstract void defender(Personagem fromPerson);
    public void initPersonagem(){
        if(this.life > 150)
            this.life = 150;
        if(this.life <= 50 && this.life > 0)
            state = "ferido";
        else if(this.life == 0)
            this.state = "morto";  
        else 
            this.state = "bem";
        this.nivel = 1;
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
}
