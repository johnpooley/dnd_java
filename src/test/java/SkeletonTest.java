import Enemies.Skeleton;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkeletonTest {
    Skeleton skeleton;

    @Before
    public void before(){
        skeleton=new Skeleton();
    }

    @Test
    public void hasDagger(){
        assertEquals(Enums.Weapons.DAGGER,skeleton.getWeapon());
    }
    @Test
    public void hasGold(){assertEquals(1,skeleton.getGold());}
    @Test
    public void hasXP(){assertEquals(10,skeleton.getExp());}
    @Test
    public void hasHP(){assertEquals(10,skeleton.getHp());}
    @Test
    public void hasInit(){assertEquals(10,skeleton.getInitiative());}
    @Test
    public void hasStrength(){assertEquals(10,skeleton.getStrength());}
    @Test
    public void hasDefence(){assertEquals(10,skeleton.getDefence());}
}
