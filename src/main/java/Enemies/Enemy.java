package Enemies;

import Enums.Weapons;

import java.util.ArrayList;

public abstract class Enemy {

    protected Enum weapon;
    protected int gold;
    protected int exp;
    protected int hp;
    protected int initiative;
    protected int strength;
    protected int defence;

    public Enemy(){
        this.gold=0;
        this.exp=0;
        this.hp=0;
        this.initiative=0;
        this.strength=0;
        this.defence=0;
    }

    public Enum getWeapon() {
        return weapon;
    }

    public int getGold() {
        return gold;
    }

    public int getExp() {
        return exp;
    }

    public int getHp() {
        return hp;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
