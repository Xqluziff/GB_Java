package OOP.homeWork_4.warriors;

import OOP.homeWork_4.warriors.Warrior;
import OOP.homeWork_4.weapons.Weapon;
import OOP.homeWork_4.weapons.rangedWeapon.Ranged;

public class Archer extends Warrior<Ranged> {
    public Archer(String name, int healthPoint, Ranged weapon) {
        super(name, healthPoint, weapon);
    }
    public int distance(){
        return super.getWeapon().distance();
    }
    @Override
    public String toString() {
        return String.format("Archer: %s\n" +
                "Distance: %d\n" +
                "Protection: %d",super.toString(), distance(),protection());
    }


    @Override
    public int protection() {
        return 0;
    }
}
