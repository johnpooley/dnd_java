package Players;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dwarf extends Player {

    public Dwarf(String name){
        super(name);
        this.weapons= new ArrayList<Weapon>();
        this.hp=40;
        this.initiative=12;
        this.strength=12;
        this.defence=9;


    }
}
