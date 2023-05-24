package homeWork;

import javax.swing.*;
import java.util.*;

public class Main_HomeWork_6 {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(101, 13.3f, "Aplle", "MacBook Air", "M1", 8, "M1 7-core", 256, 80000);
        Notebook notebook2 = new Notebook(102, 14.2f, "Aplle", "MacBook Pro", "M2 Pro", 16, "M2 Pro 16-core", 512, 205000);
        Notebook notebook3 = new Notebook(103, 17f, "MSI", "Raider GE78 HX", "Intel Core i9", 32, "GeForce RTX 4070", 1000, 185000);
        Notebook notebook4 = new Notebook(104, 15f, "MSI", "Modern 15", "Intel Core i3", 8, "GeForce RTX 3050", 256, 29990);
        Notebook notebook5 = new Notebook(105, 15f, "HP", "Victus", " AMD Ryzen 5", 8, "GeForce RTX 3050 Ti", 512, 32000);
        Notebook notebook6 = new Notebook(106, 17.3f, "HP", "NVY 17", "Intel Core i7", 16, "GeForce MX450 2 ГБ", 1000, 85000);
        Notebook notebook7 = new Notebook(107, 15.6f, "Dell", "Vostro", "AMD Athlon Silver 3050U", 4, "AMD Radeon Graphics", 256, 32000);
        Notebook notebook8 = new Notebook(108, 14f, "Dell", "Latitude ", "Intel Core i5", 8, "GeForce RTX 3080", 512, 140000);
        Notebook notebook9 = new Notebook(109, 17.3f, "Asus", "ROG Strix", "AMD Ryzen 7", 16, "GeForce RTX 3060", 1000, 62000);
        Notebook notebook10 = new Notebook(110, 15f, "Asus", "ROG Strix", "AMD Ryzen 9", 16, "Radeon RX 6800M", 512, 150000);

        Set<Notebook> notebooks = new HashSet<>(Arrays.asList(notebook1,notebook2,notebook3,notebook4,notebook5,notebook6,notebook7,notebook8,notebook9,notebook10));

        /*
        Вывод всего Множестка
        for(Notebook notebook: notebooks){
            System.out.println(notebook);

        }*/

        searchNotebook(notebooks);
    }

    public static void searchNotebook(Set<Notebook> nb) {
        Scanner console = new Scanner(System.in);
        Map<Integer, String> param = new HashMap();
        param.put(1, "Диагональ");
        param.put(2, "Производитель");
        param.put(3, "ОЗУ");
        param.put(4, "HDD");
        param.put(5, "Цена");

        System.out.println("Введите критерии поиска ноутбуков\n 1- Диагональ\n 2- Производитель\n 3- ОЗУ\n 4- HDD\n 5- Цена");
         try{
             int result = console.nextInt();
             if(result > param.size() || result < 1 ){
                 System.out.println("Не корректный выбор");
             }
             int count = 0;

             if (result == 1) {
                 System.out.println("Введите минимальную подходящую диагональ");
                 float value = console.nextFloat();
                 Map<String, Float> search = new HashMap<>();
                 search.put(param.get(result), value);

                 for (Notebook notebook : nb) {
                     if (notebook.diagonal >= value) {
                         System.out.println(notebook.toString());
                         count++;
                     }
                 }
             } else if (result == 2) {
                 System.out.println("Введите производителя");
                 String value = console.next();

                 Map<String, String> search = new HashMap<>();
                 search.put(param.get(result), value);

                 for (Notebook notebook : nb) {
                     if (notebook.name.toLowerCase().equals(value.toLowerCase())) {
                         System.out.println(notebook.toString());
                         count++;
                     }
                 }

             } else if (result == 3) {
                 System.out.println("Введите минимальную оперативную память");
                 int value = console.nextInt();
                 Map<String, Integer> search = new HashMap<>();
                 search.put(param.get(result), value);

                 for (Notebook notebook : nb) {
                     if (notebook.memory >= value) {
                         System.out.println(notebook.toString());
                         count++;
                     }
                 }

             } else if (result == 4) {
                 System.out.println("Введите минимальную жесткий диск");
                 int value = console.nextInt();
                 Map<String, Integer> search = new HashMap<>();
                 search.put(param.get(result), value);

                 for (Notebook notebook : nb) {
                     if (notebook.hdd >= value) {
                         System.out.println(notebook.toString());
                         count++;
                     }
                 }
             }else if (result == 5){
                 System.out.println("Введите минимальную цену");
                 float value = console.nextFloat();
                 Map<String, Float> search = new HashMap<>();
                 search.put(param.get(result), value);

                 for (Notebook notebook : nb) {
                     if (notebook.price >= value) {
                         System.out.println(notebook.toString());
                         count++;
                     }
                 }
             }
             System.out.println("\n\nНайденных элементов: " + count);
         }catch (Exception ex){
             System.out.println("Не корректный ввод(Не число)");
         }
    }

}
