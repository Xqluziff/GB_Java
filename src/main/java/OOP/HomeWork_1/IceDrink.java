package OOP.HomeWork_1;

public class IceDrink extends Drink{
    private String typeDrink;

    public IceDrink(String name, float volume, float temperature, float price, String typeDrink) {
        super(name, volume, temperature, price);
        this.typeDrink = typeDrink;
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Тип: %s", super.toString(), this.typeDrink);
    }
}
