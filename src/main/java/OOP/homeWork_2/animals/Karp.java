package OOP.homeWork_2.animals;

import OOP.homeWork_2.animals.base.Herbivores;
import OOP.homeWork_2.intreface.Reproduction;
import OOP.homeWork_2.intreface.SwimmingSpeed;

public class Karp extends Herbivores implements Reproduction, SwimmingSpeed {
    public Karp(String name) {
        super(name);
    }
    @Override
    public String getReproduction() {
        return "Икра";
    }
    @Override
    public float getSwimmingSpeed() {
        return 15F;
    }
    @Override
    public String toString() {
        return String.format("%s\n" +
                "Размножение: %s\n" +
                "Скорость плавания: %.1f", super.toString(),getReproduction(), getSwimmingSpeed());
    }

}
