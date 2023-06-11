package OOP.homeWork_4.warriors;

import OOP.homeWork_4.armors.Armor;
import OOP.homeWork_4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon> implements Armor {
    private String name;
    private int healthPoint;
    W weapon;

    public Warrior(String name, int healthPoint, W weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
    public int hit(){
        Random rnd = new Random();
        int currentDamage = rnd.nextInt(0, weapon.damage()  + 1);
        return currentDamage;
    }
    public int getProtection(){
        Random rnd = new Random();
        int currentProtection = rnd.nextInt(0, protection() + 1);
        return currentProtection;
    }
    public void reduceHealth(int damage){
        healthPoint -= damage;
        if(healthPoint < 0){
            healthPoint = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s\n" +
                "Health: %d\n" +
                "Weapon: %s",this.getName(), this.getHealthPoint(), this.getWeapon());
    }
}
