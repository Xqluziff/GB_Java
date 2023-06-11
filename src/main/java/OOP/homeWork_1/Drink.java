package OOP.homeWork_1;

public class Drink {
    private String  name;
    private float volume;
    private float temperature;
    private float price;


    public Drink(String name, float volume, float temperature, float price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public String getDrinkName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s\n" +
                "Объем: %.1f л\n" +
                "Температура: %.1f °С\n" +
                "Цена: %.2f ₽",  this.name, this.volume, this.temperature, this.price);
    }
}
