package Practice_1;

import java.util.Arrays;

public class Task_3 {
//    Напишите метод, который находит самую длинную строку общего
//    префикса среди массива строк.Если общего префикса нет, вернуть
//    пустую строку "".
    public static void main (String [] args){
        String [] text = {"abc", "abcdef", "abcgggg", "abeee"};//ab - prefix
        System.out.println(Arrays.toString(text));
        System.out.println(longPrefix(text));

    }
    static String longPrefix(String[] text){
        String prefix = findCommonPrefix(text);
        int sizePrefix = prefix.length();
        String max = prefix.substring(sizePrefix);
        String res = "";
        for (int i = 1; i < text.length; i++){
            String tmp = text[i].substring(sizePrefix);
            if (tmp.length() > max.length()) {
                max = tmp;
                res = text[i];
            }
        }
        return res;
    }
    static String findCommonPrefix (String[] text){
        String newText = "";
        int size = text.length;
        int min = text[0].length();
        for (int i = 1; i < size; i++){
            if (min > text[i].length()) min = text[i].length();
        }

        String first = text[0];
        first: for (int iOfElement = 0; iOfElement < min; iOfElement++){
            char firstChar = first.charAt(iOfElement);
            for (int i = 1; i < size; i++) {
                char nextChar = text[i].charAt(iOfElement);
                if (firstChar != nextChar){
                    break first;
                }
            }
            newText += first.charAt(iOfElement);
            }
        return newText;
    }
}
