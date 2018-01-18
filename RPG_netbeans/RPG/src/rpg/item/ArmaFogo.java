package rpg.item;

import rpg.personagens.Personagem;
import util.Atributo;

public abstract class ArmaFogo extends Arma implements Fogo {
    protected Atributo<Integer> bullets;
    protected Atributo<Boolean> canShoot;
    private Bala bala;
    protected int b;
    protected Atributo<Integer> MAX_BULLETS;
    
    //Não define nada, o usuário escolhe
    public ArmaFogo(String name, int cost, int maxBull, Bala balaImp) {
        super(name, cost);
        MAX_BULLETS = new Atributo<>(maxBull);
        bala = balaImp;
        this.bullets = new Atributo<>(MAX_BULLETS.getValue(), "balas");
        this.b = bullets.getValue();
        this.canShoot = new Atributo<>(true, "canShoot");
    }
    
    //Define o tipo da bala
    public ArmaFogo(String name, int cost, int maxBull) {
        super(name, cost);
        MAX_BULLETS = new Atributo<>(maxBull);
        bala = new Bala1();
        this.bullets = new Atributo<>(MAX_BULLETS.getValue(), "balas");
        this.b = bullets.getValue();
        this.canShoot = new Atributo<>(true, "canShoot");
    }
    
    //Define o tipo da bala e a quantidade de balas disponíveis (Padrão).
    public ArmaFogo(String name, int cost) {
        super(name, cost);
        MAX_BULLETS = new Atributo<>(20);
        bala = new Bala1();
        this.bullets = new Atributo<>(MAX_BULLETS.getValue(), "balas");
        this.b = bullets.getValue();
        this.canShoot = new Atributo<>(true, "canShoot");
    }
    
    @Override
    public boolean shoot(Personagem target, int userDam) {
        if(canShoot.getValue()){
            target.setLife((int)(target.getLife() - bala.potencializeDamage(this.getDam()) - userDam / 20 + target.getDef() / 100));
            bullets.setValue(--b);
            return true;
        }
        else return false;    
    }
    
    @Override
    public void recarregar(){
        this.bullets.setValue(MAX_BULLETS.getValue());
    }
    
    @Override
    public void ferir(Personagem target, int dam) {
        shoot(target, dam);
    }
    
    @Override
    public void ferir(Personagem target, int dam, int xp) {
        shoot(target, dam);
    }
    
    public int getBullets() {
        return bullets.getValue();
    }

    public void setBullets(int bullets) {
        this.bullets.setValue(bullets);
    }

    public boolean getCanShoot() {
        return canShoot.getValue();
    }

    public void setCanShoot(boolean canShoot) {
        this.canShoot.setValue(canShoot);
    }

    public Bala getBala() {
        return bala;
    }

    public void setBala(Bala bala) {
        this.bala = bala;
    }
}
