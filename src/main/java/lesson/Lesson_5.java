package lesson;

import java.util.HashMap;
import java.util.Map;

public class Lesson_5 {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        String s = "MMCMXCX";



        int res = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'I' && i != s.length()-1){
                if(s.charAt(i+1) == 'V'){
                    res += 4;
                }
                else if(s.charAt(i+1) == 'X'){
                    res += 9;
                }
                else{
                    res += 1;
                }
            }
            else{
                res += map.get(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}
