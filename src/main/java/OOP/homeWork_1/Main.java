package OOP.homeWork_1;

public class Main {
    public static void main(String[] args) {

        Vending vending = new Vending();
        vending.addSale(new Tea("Зеленый чай",0.2f, 90F, 100F, (byte) 1, "Да"))
                        .addSale(new Cofe("Американо",0.1f, 90F, 150F, (byte) 2, "Нет"))
                        .addSale(new CofeCoctale("Кофе латте",0.3f, 80F, 160F, (byte) 2, "Ореховый" ))
                        .addSale(new HotChocolate("Горячий шоколад",0.350f, 90F, 150F,  (byte) 3,"Клубничный", "Сливочное"))
                        .addSale(new IceDrink("Кола", 0.5f, 10F, 120F, "Газированная"))
                        .addSale(new IceDrink("Чай Lipton", 0.5f, 10F, 140F, "Не газированная"));

        //System.out.println(vending);

        System.out.println(vending.saleDrink("Кола"));
        System.out.println(vending);
        System.out.println(vending.getCash());

        System.out.println(vending.saleDrink("Кофе латте"));
        System.out.println(vending);
        System.out.println(vending.getCash());

    }
}
