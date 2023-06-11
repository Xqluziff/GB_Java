package OOP.homeWork_2.animals;

import OOP.homeWork_2.animals.base.Omnivorous;
import OOP.homeWork_2.intreface.CrawlSpeed;
import OOP.homeWork_2.intreface.Reproduction;
import OOP.homeWork_2.intreface.SwimmingSpeed;

public class Turtle extends Omnivorous implements Reproduction, SwimmingSpeed, CrawlSpeed {
    public Turtle(String name) {
        super(name);
    }
    @Override
    public String getReproduction() {
        return "Яйца";
    }
    @Override
    public float getSwimmingSpeed() {
        return 10;
    }
    @Override
    public float getCrawSpeed() {
        return 0.1F;
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Размножение: %s\n" +
                "Скорость плавания: %.1f\n" +
                "Скорость по суше: %.1f", super.toString(),getReproduction(), getSwimmingSpeed(), getCrawSpeed());
    }


}
