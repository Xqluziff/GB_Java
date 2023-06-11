package OOP.homeWork_4.warriors;

import OOP.homeWork_4.warriors.Warrior;
import OOP.homeWork_4.weapons.Weapon;
import OOP.homeWork_4.weapons.meleeWeapon.Melee;

public class Infantry  extends Warrior<Melee> {

    public Infantry(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s\n" +
                "Protection: %d", super.toString(), protection());
    }

    @Override
    public int protection() {
        return 5;
    }
}
