package lesson;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lesson_4 {
    static List<String> list = new LinkedList<>();
    public static void main(String[] args) {
        //System.out.println(checkString(getFromUser()));
        while (true) {
            System.out.println("Ввод: ");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            String[] s = str.split("~",2);
            int x = Integer.parseInt(s[1]);

            addElemList(s,x);
        }



    }

    public static String getFromUser(){
        System.out.println("Ввод: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static Integer checkString(String inputStr){
        String [] str = inputStr.split("~",2);
        if (str.length>0){
            try{
                return Integer.parseInt(str[1]);
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return -1;
    }

        public static void addElemList(String[] str, int num){
            File file = new File("test");


             while (list.size() <= num){
                 list.add(null);
             }
             list.set(num,str[0]);
            System.out.println(list);

        }
}
