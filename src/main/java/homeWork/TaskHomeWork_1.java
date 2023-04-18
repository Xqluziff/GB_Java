package homeWork;

import java.text.SimpleDateFormat;
import java.util.*;

public class TaskHomeWork_1 {
    public static void main(String[] args) {
        System.out.println("===============1 задача========================");
        int mas[] = initArrey(10, 5);
        System.out.println(Arrays.toString(mas));


        System.out.println("\n===============2 задача========================");
        findMinMax();

        System.out.println("\n===============3 задача========================");
        fillDiagonalsMatrix();

        System.out.println("\n===============4 задача========================");
        userGreeting();

        System.out.println("\n===============5 задача========================");
        int[] mas2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите шаг сдвига");
        int step = in.nextInt();
        shiftElem(mas2, step);
    }

    public static int[] initArrey(int len, int initValue) {
        int[] arrey = new int[len];
        for (int i = 0; i < len; i++) {
            arrey[i] = initValue;
        }
        return arrey;
    }

    public static void findMinMax() {
        System.out.println("Введите размер массива");
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();
        int len = s.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = rnd.nextInt(100);
        }

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < len; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Минимальный %d \nМаксимальный %d", min, max);
    }

    public static void fillDiagonalsMatrix() {
        System.out.println("Введите размер матрицы");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0, x = size - 1; j < size; j++, x--) {
                if (i == j || i == x) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void userGreeting() {
        System.out.println("Введите имя");
        Scanner s = new Scanner(System.in);
        String name = s.next();

        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.printf("Доброе утро %s", name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.printf("Добрый день %s", name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.printf("Добрый вечер %s", name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23 && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.printf("Доброй ночи %s", name);
        }
    }

    public static void shiftElem(int[] array, int num) {
        System.out.println(Arrays.toString(array));
        int lastElem = array.length - 1;
        if (num > 0) {
            for (int i = 0; i < num; i++) {
                int temp = array[lastElem];
                for (int j = lastElem; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = temp;
            }
        } else if (num < 0) {
            num = -num;
            for (int i = 0; i < num; i++) {
                int temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[lastElem] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
