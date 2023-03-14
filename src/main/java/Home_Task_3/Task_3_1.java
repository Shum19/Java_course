package Home_Task_3;

import MyLibb.MyLib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
public class Task_3_1 {
    public static void main(String[] args) {
        List<Integer> list = MyLib.fillList(10, 1, 10);
//        List<Integer> list = new ArrayList<>(Arrays.asList(8, 1, 9, 4, 6, 4, 5, 4, 9, 6));

        System.out.println(list);
        delOddNums(list);
        System.out.println(list);
    }
    public static void delOddNums(List<Integer> list){
        int i = 0;
        while (i < list.size()){
            int elem = list.get(i);
            if (elem %2 != 0){
                list.remove(i--);
            }
            i++;
        }
    }
}