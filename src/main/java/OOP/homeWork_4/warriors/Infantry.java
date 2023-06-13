package OOP.homeWork_4.warriors;

import OOP.homeWork_4.armors.Armor;
import OOP.homeWork_4.warriors.Warrior;
import OOP.homeWork_4.weapons.Weapon;
import OOP.homeWork_4.weapons.meleeWeapon.Melee;

public class Infantry  extends Warrior<Melee, Armor> {

    public Infantry(String name, int healthPoint, Melee weapon, Armor armor) {
        super(name, healthPoint, weapon, armor);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s\n", super.toString() );
    }


}
