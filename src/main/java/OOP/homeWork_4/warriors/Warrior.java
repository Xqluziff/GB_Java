package OOP.homeWork_4.warriors;

import OOP.homeWork_4.armors.Armor;
import OOP.homeWork_4.weapons.Weapon;

import java.util.Random;

public abstract class Warrior<W extends Weapon, A extends Armor> {
    private String name;
    private int healthPoint;
    W weapon;
    A armor;

    public Warrior(String name, int healthPoint, W weapon, A armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = armor;
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
    public A getArmor() {
        return armor;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
    public void setArmor(A armor) {
        this.armor = armor;
    }
    public int hit(){
        Random rnd = new Random();
        int currentDamage = rnd.nextInt(0, weapon.damage()  + 1);
        return currentDamage;
    }


    public int getProtection(){
        Random rnd = new Random();
        int currentProtection = rnd.nextInt(0, armor.protection() + 1);
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
