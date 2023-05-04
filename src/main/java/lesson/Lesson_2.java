package lesson;

public class Lesson_2 {
    public static void main(String[] args) {
        //System.out.println(task1());
        task2();
        //System.out.println(task3("папа"));

    }

    public static String task1() {
        char a = 'A';
        char b = 'b';
        int n = 5;
        String str = "" + a + b;
        str = str.repeat(n / 2) + ((n % 2 == 1) ? a : "");

       return str;

    }

    public static void task2() {
        String trash = "aaaabbbcddYYYYYoooooo00000";
        StringBuilder result = new StringBuilder();

        int counter = 1;

        for (int i = 0; i < trash.length() - 1; i++) {
            if (trash.charAt(i + 1) != trash.charAt(i)) {
                result.append(trash.charAt(i));
                if (counter != 1) {
                    result.append(counter);
                }
                counter = 0;
            }

            counter++;
            result.append((trash.charAt(trash.length() - 1))).append(counter);
        }

        System.out.println(result);

    }




    public static boolean task3(String str) {
        int size = str.length();
        for (int i = 0; i < size / 2; i++) {
            if (str.charAt(i) != str.charAt(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
