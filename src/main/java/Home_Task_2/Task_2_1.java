package Home_Task_2;
import MyLibb.MyLib;
/**1.  Дано четное число N (>0) и символы c1 и c2. Написать метод,
 *     который вернет строку длины N, которая состоит из чередующихся символов
 *     c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
 **/
public class Task_2_1 {
    public static void main(String[] args) {
        String test = concatChar(6, 'a', 'b');
        System.out.println(test);

    }
    public static String concatChar(int val, char first, char second){
        StringBuilder result = new StringBuilder();
        String newRes;
        for (int i = 0; i < val; i++){
            result.append(first);
            result.append(second);
        }
        if (val % 2 == 0) {
            return result.toString();
        }else{
            newRes = result.toString();
            newRes = newRes.substring(0, newRes.length() - 1);
        }
        return newRes;
    }
}
