package rpg.personagens;

import rpg.item.Mochila;
import rpg.item.Arma;
import rpg.item.Item;

public abstract class Personagem {
    private int life, xp, dam, dex, money;
    private String state;
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    private int def;
    private int nivel;
    private boolean canAtk, canDef;
    private Arma arma;
    private final Mochila moc;
    
    public Personagem(String name, int xp, Arma arma){
        this.life = 150;
        this.xp = xp;
        this.dam = this.def = (int)(10 * xp + 0.5 * (1 + life));
        this.name = name;
        this.money = 2000;
        this.arma = arma;
        this.moc = new Mochila(10);
    }
    
    protected void atacar(Personagem target){
        def++;
        dam--;
    }
    
    protected void defender(Personagem from){
        this.setLife((int)(this.getLife() + 0.1 * from.getXp() + from.getDam()));
        def--;
        dam++;
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
        boolean a = (dam < 5);
        boolean b = (def < 5);
        if(a)
            setCanAtk(false);
        if(b)
            setCanDef(false);
        else if(!(a || b)){
            setCanAtk(true);
            setCanDef(true);
        }
    }
    
    public boolean vender(Vendedor v, Item item){
        if(getMoc().exists(item) && v.receber(this, item)){
             money += item.getCost();
             return true;
        }
        return false;
    }
    
    public boolean comprar(Vendedor v, Item item){
        if(item.getCost() <= money && v.getBol().exists(item)
                && v.repassar(item)){
            money -= item.getCost();
            return true;
        }
        return false;
    }
    
    public boolean getCanAtk() {
        return canAtk;
    }
    public void setCanAtk(boolean canAtk) {
        this.canAtk = canAtk;
    }
    public boolean getCanDef() {
        return canDef;
    }
    public void setCanDef(boolean canDef) {
        this.canDef = canDef;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
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
        return arma;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    public Mochila getMoc() {
        return moc;
    }
}
