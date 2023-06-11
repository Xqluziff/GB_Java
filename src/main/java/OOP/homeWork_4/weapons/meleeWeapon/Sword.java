package OOP.homeWork_4.weapons.meleeWeapon;

public class Sword implements Melee {
    @Override
    public int damage() {
        return 12;
    }
    @Override
    public String toString() {
        return String.format("Sword: %d ", damage());
    }
}
