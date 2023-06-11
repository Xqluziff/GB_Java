package OOP.homeWork_1;

public class Cofe extends HotDrink{
    private String milk;

    public Cofe(String name, float volume, float temperature, float price, byte sugar, String milk) {
        super(name, volume, temperature, price, sugar);
        this.milk = milk;
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Молоко: %s", super.toString(), this.milk);
    }
}
