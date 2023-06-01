package OOP.HomeWork_2.animals.base;

public class Omnivorous extends Animal {
    public Omnivorous(String name) {
        super(name);
    }
    @Override
    public String feed() {
        return "Всеядное";
    }
}
