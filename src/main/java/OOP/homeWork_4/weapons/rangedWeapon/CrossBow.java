package OOP.homeWork_4.weapons.rangedWeapon;

public class CrossBow implements Ranged{
    @Override
    public int damage() {
        return 8;
    }

    @Override
    public int distance() {
        return 80;
    }
    @Override
    public String toString() {
        return String.format("CrossBow: %d ", damage());
    }
}
