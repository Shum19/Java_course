package Home_Task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/** 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
 *  Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
 *  ["string", "s", "my_value"]
 */
public class Task_3_2 {
    public static void main(String[] args) {
        List <String> listStr = new ArrayList<>(List.of("string", "s", "5",
                                                        "10", "-12", "my_value"));
        System.out.println(listStr);
        delNums(listStr);
        System.out.println(listStr);
    }
    public static void delNums(List<String> listStr){
        for (int i = 0; i < listStr.size(); i++){
            String elem = listStr.get(i);
            if (isDigit(elem) == true){
                listStr.remove(i--);
            }
        }
    }
    public static boolean isDigit(String s){
        try {
            int val = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}