package homeWork;

import java.util.*;

public class Notebook {
    public int id;
    float diagonal;
    public String name;
    public String model;
    public String processor;
    public int memory;
    public String videoCard;
    public int hdd;
    public int price;

   public Notebook(int id, float diagonal ,String name, String model, String processor, int memory, String videoCard, int hdd, int price){
       this.id = id;
       this.diagonal = diagonal;
       this.name = name;
       this.model = model;
       this.processor = processor;
       this.memory = memory;
       this.videoCard = videoCard;
       this.hdd = hdd;
       this.price = price;
   }

    @Override
    public String toString() {
        return "=====================" + "\n" +
                "Артикул: " + this.id + "\n" +
                "Диагональ: " + this.diagonal + "\"" + "\n" +
                "Марка: " + this.name + "\n" +
                "Модель: " + this.model + "\n" +
                "Процессор: " + this.processor + "\n" +
                "Память: " + this.memory + " Gb" + "\n" +
                "Видеокарта: " + this.videoCard + "\n" +
                "Жесткий диск: " + this.hdd + " Gb" + "\n" +
                "Цена: " + this.price + " ₽";
    }
}
