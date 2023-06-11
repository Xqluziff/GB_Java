package OOP.homeWork_2.animals.base;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String feed();


    @Override
    public String toString() {
        return String.format("===============\n" +
                "Название: %s\n" +
                "Корм: %s",name,feed());
    }
}
