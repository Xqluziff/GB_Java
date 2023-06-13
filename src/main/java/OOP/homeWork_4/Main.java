package OOP.homeWork_4;

import OOP.homeWork_4.armors.Armor;
import OOP.homeWork_4.armors.Shield;
import OOP.homeWork_4.warriors.Archer;
import OOP.homeWork_4.warriors.Infantry;
import OOP.homeWork_4.warriors.Warrior;
import OOP.homeWork_4.weapons.meleeWeapon.Axe;
import OOP.homeWork_4.weapons.meleeWeapon.Sword;
import OOP.homeWork_4.weapons.rangedWeapon.Bow;
import OOP.homeWork_4.weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
//        Team<Warrior> team1 = new Team<>();
//
//        team1.add(new Infantry("Воин1-1", 100, new Axe()));
//        team1.add(new Infantry("Воин1-2", 100, new Sword()));
//
//        Team<Warrior> team2 = new Team<>();
//        team2.add(new Archer("Лучник2-1", 100, new Bow()));
//        team2.add(new Infantry("Воин2-2", 100, new Axe()));
//
//        Team<Warrior> team3 = new Team<>();
//        team3.add(new Archer("Лучник3-1", 100, new CrossBow()));
//        team3.add(new Infantry("Воин3-2", 100, new Sword()));
//
//        Team<Warrior> team4 = new Team<>();
//        team4.add(new Archer("Лучник4-1", 100, new CrossBow()));
//        team4.add(new Archer("Лучник4-2", 100, new Bow()));
//
//        System.out.println("----1----");
//        System.out.println(team1);
//
//        System.out.println("----2----");
//        System.out.println(team2);
//
//        System.out.println("----3----");
//        System.out.println(team3);
//
//        System.out.println("----4----");
//        System.out.println(team4);

        Battle battle = new Battle(new Infantry("Воин 1", 100, new Sword(), new Shield()), new Infantry("Воин 2", 100, new Axe(),new Shield()));
        battle.fight();

        /*Battle battle2 = new Battle(new Archer( "Лучник 1", 100, new Bow(), new Shield()), new Archer("Лучник 2", 100, new CrossBow(),new Shield()));
        battle2.fight();*/






    }
}
