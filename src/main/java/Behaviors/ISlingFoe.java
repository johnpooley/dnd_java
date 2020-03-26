package Behaviors;

import Enemies.Enemy;
import Enums.Spells;


public interface ISlingFoe {

    public void cast(Enemy enemy, Spells spell);
}
