package homeWork;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class TaskHomeWork_2 {
    public static void main(String[] args) {
        StringBuilder sqlRequest = sqlRequest("{\"name:Ivanov\", \"country:Russia\", \"city:Moscow\", \"age:18\"}");
        System.out.println(sqlRequest);
        sqlRequest = sqlRequest("{\"name:null\", \"country:null\", \"city:null\", \"age:null\"}");
        System.out.println(sqlRequest);
        searchFormat();

    }

    public static StringBuilder sqlRequest(String json) {
        StringBuilder request = new StringBuilder("SELECT * FROM students WHERE ");
        json = json.replace("}", "");
        json = json.replace("{", "");
        json = json.replace("\"", "");
        json = json.replace(",", "',");
        json = json.replace(":", " = '");
        json += "'";

        String[] str = json.split(",");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].indexOf("null") == -1) {
                count++;
            }
        }

        if (count == 0) {
            request.delete(0, request.length());
            request.append("SELECT * FROM USER;");
        } else {
            for (int i = 0; i < str.length; i++) {
                if (str[i].indexOf("null") == -1) {
                    request.append(str[i]);
                    if (count - 1 > 0) {
                        request.append(" and");
                        count--;
                    }
                }
            }
            request.append(";");
        }
        return request;
    }

    public static void searchFormat(){
            try {
                File file = new File ("./src/main/java/homeWork/Files");
                StringBuilder format = new StringBuilder("Расширение файла");

                for (File i: file.listFiles()) {
                    int x = i.getName().lastIndexOf('.');
                    if (x != -1) {
                        System.out.printf("%s: %s\n",format, i.getName().substring(x));
                    } else {
                        System.out.println(format);
                    }
                }
            } catch (Exception ex) {
                System.out.println("Что-то пошло не так!");
            }
    }
}