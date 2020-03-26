package Players;

import Enemies.Enemy;
import Enums.Weapons;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Dwarf extends Player {

    public Dwarf(String name){
        super(name);
        this.weapons= new ArrayList<Weapons>(Collections.singleton(Weapons.HAMMER));
        this.hp=40;
        this.initiative=12;
        this.strength=12;
        this.defence=9;


    }

    public void  attack(Enemy enemy){
        Weapons weapon= this.weapons.get(0);
        int power=this.strength+weapon.getDamage();
        int newHp=enemy.getHp();
        newHp-=power;
        enemy.setHp(newHp);
    }
}
