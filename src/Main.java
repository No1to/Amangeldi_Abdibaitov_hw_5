public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHp(22222);
        boss.setBossDmg(2222);
        boss.setBossDef("Physical");
        System.out.println("Boss statistic: ");
        System.out.println(" ");
        System.out.println("Health: " + boss.getBossHp());
        System.out.println("Damage: " + boss.getBossDmg());
        System.out.println("Defense: " + boss.getBossDef());

        Hero[] heroes = createHeroes();

        for (Hero hero : heroes) {
            System.out.println(" ");
            System.out.println("Name: " + hero.getName());
            System.out.println("Health: " + hero.getHp());
            System.out.println("Damage: " + hero.getDmg());
            System.out.println("Ultimate: " + hero.getUltimate());
        }
    }

    public static Hero[] createHeroes() {
        Hero Hulk = new Hero("Hulk", 2222, 222, "Rage");
        Hero Thor = new Hero("Thor", 1700, 170, "Molot");
        Hero Batman = new Hero("Batman", 300, 300);

        return new Hero[]{Hulk, Thor, Batman};
    }
}