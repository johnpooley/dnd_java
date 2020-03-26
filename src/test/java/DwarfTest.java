import Enums.Weapons;
import Players.Dwarf;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class DwarfTest {


    Dwarf dwarf;

    @Before
    public void before(){ dwarf = new Dwarf("Nigel");}


//    check initialization
    @Test
    public void hasName(){assertEquals("Nigel",dwarf.getName());}
    @Test
    public void hasNoWeapon(){assertEquals(1,dwarf.getWeapons().size());}
    @Test
    public void hasNoItems(){assertEquals(0,dwarf.getItems().size());}
    @Test
    public void hasNoGold(){assertEquals(0,dwarf.getGold());}
    @Test
    public void hasNoXP(){assertEquals(0,dwarf.getExp());}
    @Test
    public void hasHP(){assertEquals(40,dwarf.getHp());}
    @Test
    public void hasInit(){assertEquals(12,dwarf.getInitiative());}
    @Test
    public void hasStrength(){assertEquals(12,dwarf.getStrength());}
    @Test
    public void hasDefence(){assertEquals(9,dwarf.getDefence());}

    @Test
    public void canSetGold(){
        dwarf.setGold(8);
        assertEquals(8,dwarf.getGold());
    }
    @Test
    public void canSetHP(){
        dwarf.setHp(7);
        assertEquals(7,dwarf.getHp());
    }
    @Test
    public void canSetInitiative(){
        dwarf.setInitiative(10);
        assertEquals(10,dwarf.getInitiative());
    }
    @Test
    public void canSetStrength(){
        dwarf.setStrength(20);
        assertEquals(20,dwarf.getStrength());
    }
    @Test
    public void canSetDefence(){
        dwarf.setDefence(90);
        assertEquals(90,dwarf.getDefence());
    }

    @Test
    public void hasHammer(){
        assertEquals(true,dwarf.getWeapons().contains(Enums.Weapons.HAMMER));
    }

    @Test
    public void hasDagger(){
        assertEquals(false,dwarf.getWeapons().contains(Enums.Weapons.DAGGER));
    }

}
