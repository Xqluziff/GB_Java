package OOP.HomeWork_1;

public class HotChocolate extends CofeCoctale {
    private String iceCream;

    public HotChocolate(String name, float volume, float temperature, float price,  byte sugar, String syrop, String iceCream) {
        super(name, volume, temperature, price, sugar,syrop);
        this.iceCream = iceCream;
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Мороженое: %s",super.toString(), this.iceCream);
    }
}
