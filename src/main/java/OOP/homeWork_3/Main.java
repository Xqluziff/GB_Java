package OOP.homeWork_3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    LiknedListRepeter list = new LiknedListRepeter();
        list.add("1");
        list.add("2");

        list.add(1, "3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(element);
        }



    }
}
