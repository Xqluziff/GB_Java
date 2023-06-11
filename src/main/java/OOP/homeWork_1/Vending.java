package OOP.homeWork_1;

import java.util.ArrayList;
import java.util.List;

public class Vending {
    private List<Drink> vending = new ArrayList<>();
    private float cash = 0;

    public Vending addSale(Drink drink){
        vending.add(drink);
        return this;
    }

    public Drink findDrink(String name){
        for (Drink drink:vending) {
            if (name.equals(drink.getDrinkName())){
                return drink;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Drink saleDrink(String name){
        Drink founded = findDrink(name);
        if (founded != null){
            cash += founded.getPrice();
            vending.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Сумма: ").append(cash).append("\n\n");
        for (Drink drink:vending){
            builder.append(drink).append("\n");
        }

        return builder.toString();
    }
}
