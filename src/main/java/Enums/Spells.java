package Enums;

public enum Spells {
    FIREBALL(10,5),
    LIGHTNING(20,10),
    HEAL(5,5);

    private final int damage;
    private final int manaCost;
    Spells(int damage, int manaCost) {
        this.damage=damage;
        this.manaCost=manaCost;
    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }
}
