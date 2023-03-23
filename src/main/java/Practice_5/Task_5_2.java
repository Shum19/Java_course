package Practice_5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;

/** () true
 * [() false
 * [()] true
 * {}()[] <>true
 * {(]])}{()} false
 * ([)] false
 */
public class Task_5_2 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()"));//true
        System.out.println(isCorrectParentheses("[()"));//false
        System.out.println(isCorrectParentheses("[()]"));//true
        System.out.println(isCorrectParentheses("{}()[]<>"));//true
        System.out.println(isCorrectParentheses("{(]])}{()}"));//false
        System.out.println(isCorrectParentheses("([)]"));//false
        System.out.println(isCorrectParentheses(")]"));// false
        System.out.println(isCorrectParentheses("(((((")); // false
    }
    public static boolean isCorrectParentheses(String parentheses){
        char [] chars = parentheses.toCharArray();
        if (chars.length % 2 != 0) return false;
        Map <Character, Character> dict = Map.of('(', ')', '{', '}',
                                                 '[', ']', '<', '>' );
        Deque<Character> symbols = new ArrayDeque<>();
        for (char c : chars) {
            if (dict.containsKey(c)){
                symbols.add(c);
            }else {
                if (symbols.isEmpty()) return false;
                Character lastSymbol = symbols.pollLast();// == '('  получит и сразу удалит из stack
                // пимер () то dict.get(lastSymbol) == ')' и с == ')'
                if (!Objects.equals(dict.get(lastSymbol), c)) return false;
            }
        }
        return symbols.isEmpty();// так symbols.pollLast удалил символ то список пустой поэтому true
    }
}
