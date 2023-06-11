package OOP.homeWork_2.animals.base;

public class Herbivores extends Animal {
    public Herbivores(String name) {
        super(name);
    }
    @Override
    public String feed() {
        return "Водоросли";
    }

}
