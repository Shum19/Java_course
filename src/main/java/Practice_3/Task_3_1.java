package Practice_3;

import MyLibb.MyLib;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task_3_1 {
    public static void main(String[] args) {
        Random ranNum = new Random();
        List<Integer> integer = new ArrayList<>(Arrays.asList(5, 1, 5)); //(1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9, 9));
//        for (int i = 0; i < 10; i++) {
//           integer.add(ranNum.nextInt(1, 4));
//        }
        System.out.println(integer);
        removeDuplicates (integer);
        System.out.println(integer);
    }
    public static void removeDuplicates(List<Integer> col){
        int i = 0;
//        while (i < col.size()){
//            int j = i+1;
//            while (j < col.size()){
//                if (col.get(i).equals(col.get(j))){
//                    col.remove(j);
//                }
//                j++;
//            }
//            i++;
//        }
        List<Integer> duplicates = new ArrayList<>();
        while (i < col.size()){
            Integer element = col.get(i);
            if (!duplicates.contains(element)) {
                duplicates.add(element);
            }else {

                col.remove(i--);
            }
            i++;
        }
    }
}