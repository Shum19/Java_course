package Home_Task_5;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */

public class Home_Task_5_1 {
    public static void main(String[] args) {
        String text =  "Мороз и солнце день чудесный Еще ты дремлешь друг " +
                        "прелестный Пора красавица проснись";
        collectStats(text);
    }
    static void collectStats(String text) {
        Map <Integer, List<String>> stats = new HashMap<>();
        List<String> words = new ArrayList<>(Arrays.asList(text.split(" ")));
        for (String word : words) {
            List<String> newWords = new ArrayList<>();
            int key = word.length();
            if (stats.containsKey(key)){
                 newWords = stats.get(key);
                 newWords.add(word);
                 stats.put(key, newWords);
            }else {
                newWords.add(word);
                stats.putIfAbsent(key, newWords);
            }
        }
        for (Integer integer : stats.keySet()) {
            String str = Arrays.toString(stats.get(integer).toArray());
            str = str.substring(1, str.length()-1);
            System.out.println(integer + " -> " +str);
        }
    }
}
