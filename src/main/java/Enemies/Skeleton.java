package Enemies;

import Enums.Weapons;

import java.util.ArrayList;
import java.util.Collections;

public class Skeleton extends Enemy{


    public Skeleton(){
        this.weapon= Weapons.DAGGER;
        this.gold=1;
        this.exp=10;
        this.hp=10;
        this.initiative=10;
        this.strength=10;
        this.defence=10;
    }

}
