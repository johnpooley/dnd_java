package Players;

import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private ArrayList<Weapon>weapons;
    private ArrayList<Item>items;
    private int gold;
    private int exp;
    private int hp;
    private int initiave;
    private int strength;
    private int defence;

    public Player (String name){
        this.name=name;
        this.weapons=new ArrayList<Weapon>();
        this.items=new ArrayList<Item>();
        this.gold=0;
        this.exp=0;
        this.hp=0;
        this.initiave=0;
        this.strength=strength;
        this.defence=defence;
    }

}
