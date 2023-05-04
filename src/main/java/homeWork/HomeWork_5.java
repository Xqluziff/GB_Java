package homeWork;

import java.util.*;

public class HomeWork_5 {
    static Map<String, String> mapEmployee = new HashMap<>();

    public static void main(String[] args) {

        // ====== 1 задание=======
        //addEmployee(mapEmployee);
        //sortEmployee(mapEmployee);

        // ====== 2 задание ======
        //getReplayName(mapEmployee);
        ferzy();


    }

    private static void ferzy() {
        int[] queens = new int[8];
        findPosition(0, queens);

        // Вывод доски в консоль
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("\tX");
                } else {
                    System.out.print("\to");
                }
            }
            System.out.println();
        }
    }

    // Функция для поиска расстановки ферзей
    private static boolean findPosition(int row, int[] queens) {
        if (row == 8) { // Если удалось расставить всех 8 ферзей, вернуть true
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                // Проверка на наличие конфликта по вертикали, диагонали и антидиагонали
                if (queens[i] == col || queens[i] == col - row + i || queens[i] == col + row - i) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                queens[row] = col; // Сохранить расстановку ферзя в массив
                if (findPosition(row + 1, queens)) { // Рекурсивный вызов для следующего ряда
                    return true;
                }
            }
        }
        return false;
    }


    private static void sortEmployee(Map<String, String> mapEmployee) {

        ArrayList<String> listCount = new ArrayList<>();
        for (var item : mapEmployee.entrySet()) {
            if (listCount.contains(item.getValue()) == false) {
                listCount.add(item.getValue());
            }
        }
        listCount.sort(null);
        for (int i = 0; i < listCount.size(); i++) {
            for (var item : mapEmployee.entrySet()) {
               if (listCount.get(i).equals(item.getValue())) {
                   System.out.printf("%s : %s \n", item.getKey(), item.getValue());
                }
            }
        }
    }
    private static void getReplayName(Map<String, String> map) {
        List<String> listAllName = new ArrayList<>();
        String[] firstName;
        String [] unicFirstName;
        for (String value : map.values()) {
            firstName = value.split(" ");
            listAllName.add(firstName[0]);
        }
        listAllName.sort(null);
        Map<String, Integer> replayName = new HashMap<>();
        for (int i = 0; i < listAllName.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < listAllName.size(); j++) {
                if (listAllName.get(i).equals(listAllName.get(j))) {
                    count++;
                    i++;
                }
            }
            if (count > 1) {
                replayName.put(listAllName.get(i), count);
            }
        }
        List<Integer> listName = new ArrayList<>();
        for (Integer val : replayName.values()) {
            if(!listName.contains(val)){
                listName.add(val);
            }

        }
        listName.sort(null);

        for (int i = listName.size()-1; i >= 0 ; i--){
            for (Map.Entry<String,Integer> item: replayName.entrySet()){
                if (listName.get(i) == item.getValue()) {
                    System.out.printf("%s : %d \n", item.getKey(), item.getValue());
                }
            }
        }
    }
    public static void addEmployee(Map<String, String> map) {

        map.put("8800111", "Иван Иванов");
        map.put("8800333", "Светлана Петрова");
        map.put("8800123", "Кристина Белова");
        map.put("8800213", "Анна Мусина");
        map.put("8800312", "Анна Крутова");
        map.put("8800321", "Иван Юрин");
        map.put("8800456", "Петр Лыков");
        map.put("8800654", "Павел Чернов");
        map.put("8800222", "Иван Иванов");
        map.put("8800546", "Петр Чернышов");
        map.put("8800564", "Марина Светлова");
        map.put("8800789", "Мария Рыкова");
        map.put("8800444", "Светлана Петрова");
        map.put("8800555", "Светлана Петрова");
        map.put("8800987", "Марина Лугова");
        map.put("8800999", "Анна Владимирова");
        map.put("8800888", "Иван Мечников");
        map.put("8800777", "Петр Петин");
        map.put("8800098", "Иван Ежов");

    }

}







