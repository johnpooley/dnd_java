package Players;

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
}
