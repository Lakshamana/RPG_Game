package rpg.personagens;

public abstract class Personagem {
    int life, xp, dam, dex, money;
    String state, name;
    int nivel;
    Personagem enemy;
    
    protected final static int[] uplevels = {10, 20, 30, 50, 80, 100}; 
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
    void initPersonagem(){
        if(this.life > 150)
            this.life = 150;
        if(this.life <= 50 && this.life > 0)
            state = "ferido";
        this.nivel = 1;
        if(this.life == 0)
            this.state = "morto";
        
    }
    public String getState(){
        return this.state;
    }
    public int getLevel(){
        return this.nivel;
    }
}
