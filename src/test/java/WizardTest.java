import Enemies.Skeleton;
import Enums.Spells;
import Players.Dwarf;
import Players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Skeleton skeleton;
    Dwarf dwarf;
    Skeleton skeleton2;

    @Before
    public void before() {
        wizard = new Wizard("Barry");
        skeleton = new Skeleton();
        dwarf = new Dwarf("Steve");
        skeleton2 = new Skeleton();
    }

    @Test
    public void canCastAttackSpell(){
        wizard.cast(skeleton, Spells.FIREBALL);
        assertEquals(0,skeleton.getHp());
    }

    @Test
    public void canCastHealSpell(){
        wizard.cast2(dwarf,Spells.HEAL);
        assertEquals(45,dwarf.getHp());
        assertEquals(15,wizard.getMana());
    }

    @Test
    public void cantCastAttackSpell(){
        wizard.cast(skeleton,Spells.LIGHTNING);
        wizard.cast(skeleton,Spells.LIGHTNING);
        wizard.cast(skeleton2,Spells.FIREBALL);
        assertEquals(10,skeleton2.getHp());
    }

    @Test
    public void cantCastHealSpell(){
        wizard.cast(skeleton,Spells.LIGHTNING);
        wizard.cast(skeleton,Spells.LIGHTNING);
        wizard.cast2(dwarf,Spells.HEAL);
        assertEquals(40,dwarf.getHp());
    }



}
