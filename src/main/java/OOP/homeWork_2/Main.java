package OOP.homeWork_2;

import OOP.homeWork_2.animals.Karp;
import OOP.homeWork_2.animals.Piranhas;
import OOP.homeWork_2.animals.Turtle;

public class Main {
    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();
        aquarium.addAnimal(new Piranhas("Пирань")).addAnimal(new Karp("Карп")).addAnimal(new Turtle("Черепаха"));

        System.out.println(aquarium.toString());


        System.out.println("Чемпион!!!\n" + aquarium.getChampSpeed());
    }
}
