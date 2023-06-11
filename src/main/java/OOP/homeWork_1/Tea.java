package OOP.homeWork_1;

public class Tea extends HotDrink{
    private String lime;


    public Tea(String name, float volume, float temperature, float price,byte sugar, String lime ) {
        super(name, volume, temperature, price, sugar);
        this.lime = lime;
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Лимон: %s", super.toString(), this.lime);
    }
}
