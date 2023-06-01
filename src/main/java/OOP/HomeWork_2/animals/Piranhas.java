package OOP.HomeWork_2.animals;

import OOP.HomeWork_2.animals.base.Pridator;
import OOP.HomeWork_2.intreface.Reproduction;
import OOP.HomeWork_2.intreface.SwimmingSpeed;

import java.lang.annotation.Annotation;

public class Piranhas extends Pridator implements Reproduction, SwimmingSpeed {
    public Piranhas(String name) {
        super(name);
    }
    @Override
    public String getReproduction() {
        return "Икра";
    }
    @Override
    public float getSwimmingSpeed() {
        return 30F;
    }
    @Override
    public String toString() {
        return String.format("%s\n" +
                "Размножение: %s\n" +
                "Скорость плавания: %.1f", super.toString(),getReproduction(), getSwimmingSpeed());
    }
}
