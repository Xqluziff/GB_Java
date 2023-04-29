package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

public class TaskHomeWork_3 {
    public static void main(String[] args) {
        deleteDigit();

        libraryBooks();

        String[] planetsNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Pluto"};
        planetReplayDelete(planetsNames);

    }
    public static void deleteDigit() {
        List<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("20.5");
        list.add("Груша");
        list.add("-3.5");
        list.add("Слива");
        list.add("100");
        list.add("Арбуз");

        System.out.println(Arrays.toString(list.toArray()));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).matches("-?\\d+(\\.\\d+)?")){
                list.remove(i);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void libraryBooks(){
        List<ArrayList<String>> library = new ArrayList<>();
        Scanner in =  new Scanner(System.in);
        String genre = "";
        String nameBook = "";

        while (!genre.equals("0")){
            System.out.println("Введите жанр: \t\t0 - для выхода");
            genre = in.nextLine();
            if(genre.equals("0")){
                break;
            }
            System.out.println("Введите название книги: ");
            nameBook = in.nextLine();

            if(library.isEmpty()){
                library.add(new ArrayList<>());
                library.get(0).add(genre.toUpperCase());
                library.get(0).add(nameBook);
            }
            else {
                for (int i = 0; i < library.size(); i++) {
                    if(library.get(i).get(0).equals(genre.toUpperCase())){
                        library.get(i).add(nameBook);
                        break;
                    }
                    if (i == library.size()-1){
                        library.add(new ArrayList<>());
                        library.get(library.size()-1).add(genre.toUpperCase());
                        library.get(library.size()-1).add(nameBook);
                        break;
                    }
                }
            }
            System.out.println(library);
        }
    }

    public static void planetReplayDelete(String[] planets){
        //String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Pluto"};
        Random rnd = new Random();
        List<String> list = new ArrayList<>();
        int size = planets.length;
        for (int i = 0; i < 100; i++) {
            list.add(planets[rnd.nextInt(size)]);
        }
        for (int i = 0; i < size; i++) {
            System.out.printf("%s : %d\n", planets[i], Collections.frequency(list, planets[i]));
        }

        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
