package Practice_5;

import java.util.HashMap;
import java.util.Map;

/**
 * Проверить, что 2 строки являются изоморфными в том смысле, что одну букву в первом слове можно заменить на какую-то во втором.
 * Изоморфные строки имеют одинаковую длину.
 * Примеры:
 * (foo, bar) -> false f -> b, o -> a
 * (paper, title) -> true p -> t, a -> i, e -> l, r -> e
 * (egg, add) -> true e -> a, g -> d
 * (abcde, bcdef) -> true a -> b, b -> c, c -> d, d -> e, e -> f
 */
public class Task_5_1 {
    public static void main(String[] args) {
        System.out.println(isMatches("foo", "bar"));
        System.out.println(isMatches("paper", "title"));
        System.out.println(isMatches("egg", "add"));
        System.out.println(isMatches("abcde", "bcdef"));
    }


    static boolean isMatches(String s1, String s2) {
        Map<Character, Character> map = new HashMap<>();
        char [] s1Arr = s1.toCharArray();
        char [] s2Arr = s2.toCharArray();
        for (int j = 0; j < s2Arr.length; j++) {
            if(map.containsKey(s1Arr[j])) {
                char chValue = map.get(s1Arr[j]);
                if (chValue != s2Arr[j]) return false;
            }
            map.put(s1Arr[j], s2Arr[j]);
        }
        return true;
    }

}
