package Enums;

public enum Weapons {
    SWORD(10,5),
    HAMMER(15,9),
    DAGGER(5,2)
    ;

    private final int damage;
    private final int weight;

    Weapons(int damage,int weight){
        this.damage=damage;
        this.weight=weight;
    }

    public int getDamage() {
        return damage;
    }

    public int getWeight() {
        return weight;
    }
}
