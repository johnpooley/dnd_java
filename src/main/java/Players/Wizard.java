package Players;

import Behaviors.ISlingFoe;
import Behaviors.ISlingFriend;
import Enemies.Enemy;
import Enums.Spells;
import Enums.Weapons;

import java.util.ArrayList;
import java.util.Collections;

public class Wizard extends Player implements ISlingFoe, ISlingFriend {




    public Wizard(String name) {
        super(name);
        this.hp=30;
        this.initiative=12;
        this.strength=12;
        this.defence=9;
        this.mana=20;
    }

    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void cast(Enemy enemy, Spells spell) {
        if(this.getMana()>=spell.getManaCost()){
        int power=spell.getDamage();
        int newHp=enemy.getHp();
        newHp-=power;
        enemy.setHp(newHp);
        this.mana-=spell.getManaCost();}
    }

    public void cast2(Player player,Spells spell) {
        if(this.getMana()>=spell.getManaCost()){
        int power=spell.getDamage();
        int newHp=player.getHp();
        newHp+=power;
        player.setHp(newHp);
        this.mana-=spell.getManaCost();}

    }
}
