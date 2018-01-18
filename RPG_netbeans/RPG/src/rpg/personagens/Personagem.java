package rpg.personagens;

import java.util.ArrayList;
import rpg.item.Arma;
import rpg.item.ArmaBranca;
import rpg.item.Usavel;
import rpg.negocios.Negociante;
import util.Atributo;
import util.BancoAtributos;

public abstract class Personagem extends Negociante{
    private Atributo<Integer> life, xp, dam, dex, nivel, def;
    private Atributo<String> name, state;
    private Atributo<Boolean> canAtk, canDef;
    private Arma arma;
    private BancoAtributos bancoAtr = new BancoAtributos();

    public BancoAtributos getBancoAtr() {
        return bancoAtr;
    }

    public void setBatr(BancoAtributos batr) {
        this.bancoAtr = batr;
    }
    
    public void levelUp(){
        setLife(getLife() + 20);
        setLevel(getLevel() + 1);
        setDam(getDam() + 15);
        setDef(getDef() + 15);
        System.out.printf("\n** Novo nível de caba-machêza: %d! **\n", getLevel());
    }
    
    protected void usarItem(Usavel u){
        
    }
    
    public Personagem(String name){
        this.life = new Atributo<>(150, "life");
        this.xp = new Atributo<>(30, "xp");
        int d = (int) (300 + 0.5 * (1 + life.getValue()));
        this.dam = new Atributo<>(d, "dam");
        this.def = new Atributo<>(d, "def");
        this.name = new Atributo<>(name, "name");
        this.arma = new ArmaBranca("peixeira", 100);
    }
    
    protected void atacar(Personagem target){
        def.setValue(def.getValue() + 1);
        dam.setValue(dam.getValue() - 1);
    }
    
    protected void defender(Personagem from){
        this.setLife((int)(this.getLife() + 0.1 * from.getXp() + from.getDam()));
        def.setValue(def.getValue() - 1);
        dam.setValue(dam.getValue() + 1);
    }
    
    public void initPersonagem(){
        nivel.setValue(1); 
        int lifeValue = life.getValue();
        if(lifeValue > 150)
            lifeValue = 150;
        if(lifeValue <= 50 && lifeValue > 0)
            state.setValue("vivo e ferido"); 
        else if(lifeValue == 0)
            state.setValue("morto"); 
        else
            state.setValue("vivo");
        boolean a = (dam.getValue() < 5);
        boolean b = (def.getValue() < 5);
        if(a)
            setCanAtk(false);
        if(b)
            setCanDef(false);
        else if(!(a || b)){
            setCanAtk(true);
            setCanDef(true);
        }
    }
    
    public ArrayList<Object> getAtributos(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(life);
        list.add(xp);
        list.add(dam);
        list.add(dex);
        list.add(nivel);
        list.add(def); 
        list.add(canAtk);
        list.add(canDef);
        list.add(state);
        return list;
    }
    
    public void trocarArma(Arma novaArma){
        if(getMoc().existe(novaArma)){
            getMoc().remover(novaArma);
            getMoc().inserir(arma);
            setArma(novaArma);
        } else System.err.println("Arma não existe na mochila! Escolha outra.");
    }
    
    public String getName() {
        return name.getValue();
    }

    public void setName(String name) {
        this.name.setValue(name);
    }
    
    public boolean getCanAtk() {
        return canAtk.getValue();
    }
    
    public void setCanAtk(boolean canAtk) {
        this.canAtk.setValue(canAtk);
    }
    
    public boolean getCanDef() {
        return canDef.getValue();
    }
    
    public void setCanDef(boolean canDef) {
        this.canDef.setValue(canDef);
    }
    
    public int getDef() {
        return def.getValue();
    }
    
    public void setDef(int def) {
        this.def.setValue(def);
    }
    
    public String getState(){
        return this.state.getValue();
    }
    
    public void setState(String state){
        this.state.setValue(state);
    }
    
    public int getLevel(){
        return this.nivel.getValue();
    }
    
    public void setLevel(int level){
        this.nivel.setValue(level);
    }
    public int getLife(){
        return this.life.getValue();
    }
    
    public void setLife(int life){
        this.life.setValue(life);
    }
    
    public int getXp(){
        return this.xp.getValue();
    }
    
    public void setXp(int xp){
        this.xp.setValue(xp);
    }
    
    public int getDam(){
        return this.dam.getValue();
    }
    
    public void setDam(int dam){
        this.dam.setValue(dam);
    }
    
    public int getDex(){
        return this.dex.getValue();
    }
    
    public void setDex(int dex){
        this.dex.setValue(dex);
    }
    
    public Arma getArma() {
        return arma;
    }
    
    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
