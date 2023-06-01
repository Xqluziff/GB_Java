package OOP.HomeWork_2.animals.base;

public class Pridator extends Animal {

    public Pridator(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "Рыбки";
    }
}
