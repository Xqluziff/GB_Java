package OOP.homeWork_4.warriors;

import OOP.homeWork_4.armors.Armor;
import OOP.homeWork_4.warriors.Warrior;
import OOP.homeWork_4.weapons.Weapon;
import OOP.homeWork_4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged, Armor> {
    public Archer(String name, int healthPoint, Ranged weapon, Armor armor) {
        super(name, healthPoint, weapon, armor);
    }
    public int distance(){
        return super.getWeapon().distance();
    }
    @Override
    public String toString() {
        return String.format("Archer: %s\n" +
                "Distance: %d" ,super.toString(), distance());
    }



}
