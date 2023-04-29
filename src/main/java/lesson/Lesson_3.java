package lesson;

import java.util.*;

public class Lesson_3 {
    public static void main(String[] args) {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Pluto"};
        Random rnd = new Random();
        List<String> list = new ArrayList<>();
        int size = planetsNamesStringArray.length;
        for (int i = 0; i < 100; i++) {
            list.add(planetsNamesStringArray[rnd.nextInt(size)]);
        }
        for (int i = 0; i < size; i++) {

            System.out.printf("%s : %d\n", planetsNamesStringArray[i], Collections.frequency(list, planetsNamesStringArray[i]));
        }

        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
//
//        Set<String> hash = new HashSet<>(list);
//        System.out.println(hash);
       List<ArrayList<String>> books = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < 3; i++) {
                books.add(new ArrayList<>());
                books.get(i).add("Жанр");
                books.get(i).add("Книга");

        }
        System.out.println(books);
    }
}
