public class Hero {
    private String name;
    private int hp;
    private int dmg;
    private String ultimate;

    public String getName() {
        return name;
    }

    public Hero(String name, int hp, int dmg, String ultimate){
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.ultimate = ultimate;
    }

    public Hero(String name, int hp, int dmg){
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public String getUltimate() {
        return ultimate;
    }
}