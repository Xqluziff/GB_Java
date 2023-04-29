package homeWork;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HomeWork_4 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> linkedList = addLinkedList();
        List<String> reversLinkedList =  reversLinkedList(linkedList);
        System.out.println(reversLinkedList);

    }
    private static List<String> reversLinkedList(List<String> list) {
        int size = list.size();
        List<String> newList = new LinkedList<>();
        while (size!=0){
            newList.add(list.get(size-1));
            size--;
        }
        return newList;
    }

    public static List<String> addLinkedList() {
        List<String> linkedList = new LinkedList<>();
        String str = "";
        while (!str.equals("exit")) {
            System.out.println("Введите слово");
            str = console.nextLine();
            if(str.equals("exit")){
                break;
            }
            if (str.equals("print")) {
                System.out.println(linkedList);
                break;
            }
            if (str.equals("revert")) {
                linkedList.remove(linkedList.size() - 1);
                System.out.println(linkedList);
                break;
            }
            else {
                linkedList.add(str);
            }
        }
        return linkedList;
    }
}
