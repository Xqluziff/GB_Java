package OOP.homeWork_4.weapons.rangedWeapon;

public class Bow implements Ranged{
    @Override
    public int damage() {
        return 6;
    }

    @Override
    public int distance() {
        return 50;
    }
    @Override
    public String toString() {
        return String.format("Bow: %d ", damage());
    }
}
