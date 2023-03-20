package Practice_4;

import java.util.*;

public class Task_4_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        long timeStart = System.currentTimeMillis();
        for (Integer i = 0; i <1_000_000; i++){
            list.add(i);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println(timeStart - timeEnd);

    }

}