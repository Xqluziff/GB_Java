package lesson;

import java.util.Arrays;
/*
* В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59*/

/*Дан массив двоичных чисел, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.*/

public class Lesson_1 {
    public static void main(String[] args) {


//        Scanner s = new Scanner(System.in);
//        System.out.println("Введите имя");
//        //Date data = new Date();
//        String str = s.nextLine();
//        System.out.println(str);

        int[] mas = {3, 1, 2, 3,4};
        int[] temp = new int[mas.length];
//        for (int i = 0,k = 0, j = 0; i < mas.length ; i++) {
//            if(mas[i] != 3 ){
//                temp[j] = mas[i];
//                j++;
//            }
//            else {
//                temp[temp.length-1-k] = mas[i];
//                k++;
//            }
//        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 3) {
                int t = mas[i];
                for (int j = 0; j < mas.length-1; j++) {
                    mas[j] = mas[j+1];
                    //
                }

                mas[mas.length-1-i] = t;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
