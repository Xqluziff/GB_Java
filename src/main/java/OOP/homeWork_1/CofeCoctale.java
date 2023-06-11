package OOP.homeWork_1;

public class CofeCoctale extends HotDrink{
    private String syrop;

    public CofeCoctale(String name, float volume, float temperature, float price, byte sugar, String syrop) {
        super(name, volume, temperature, price,sugar);
        this.syrop = syrop;
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Сироп: %s", super.toString(), this.syrop);
    }
}
