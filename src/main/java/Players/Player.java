package Players;

import Enemies.Enemy;
import Enums.Weapons;
import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected ArrayList<Weapons> weapons;
    protected ArrayList<Integer> items;
    protected int gold;
    protected int exp;
    protected int hp;
    protected int initiative;
    protected int strength;
    protected int defence;

//getters
    public String getName() { return name; }
    public ArrayList<Weapons> getWeapons() { return weapons; }
    public ArrayList<Integer> getItems() { return items; }
    public int getGold() { return gold; }
    public int getExp() { return exp; }
    public int getHp() { return hp; }
    public int getInitiative() { return initiative; }
    public int getStrength() { return strength; }
    public int getDefence() { return defence; }

//    setters


    public void setWeapons(ArrayList<Weapons> weapons) {
        this.weapons = weapons;
    }
    public void setItems(ArrayList<Integer> items) {
        this.items = items;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }


    public Player (String name){
        this.name=name;
        this.weapons=new ArrayList<Weapons>();
        this.items=new ArrayList<Integer>();
        this.gold=0;
        this.exp=0;
        this.hp=0;
        this.initiative=0;
        this.strength=0;
        this.defence=0;
    }

    public void  attack(Enemy enemy){
        Weapons weapon= this.weapons.get(0);
        int power=this.strength+weapon.getDamage();
        int newHp=enemy.getHp();
        newHp-=power;
        enemy.setHp(newHp);
    }

}
