package OOP.homeWork_1;

public class HotDrink extends Drink {
    private byte sugar;

    public HotDrink(String name, float volume, float temperature, float price, byte sugar) {
        super(name, volume, temperature, price);
        this.sugar = sugar;

    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Сахар: %d л", super.toString(), this.sugar);
    }
}
