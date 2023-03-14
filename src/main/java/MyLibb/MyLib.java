package MyLibb;

import java.util.*;

public class MyLib {
//     Change space char for underline char
        public static String  Underline(String text){
        String newText = text.replace(' ', '_');
        return newText;
        }
//        Clear console
        public static void ClearConsole(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        public static int inputInteger(String message){
            Scanner input = new Scanner(System.in);
            System.out.println(message);
            int value = input.nextInt();
            return value;
        }
        public static String inputString (String message){
            Scanner input = new Scanner(System.in);
            System.out.println(message);
            String text = input.next();
            return text;
        }
        public static List<Integer> fillList (int length, int begin, int end){
            List <Integer> list = new ArrayList<Integer>(Arrays.asList());
            Random ranInt = new Random();
            for (int i = 0; i < length; i++){
                list.add(ranInt.nextInt(begin, end + 1));
            }
            return list;
        }
    }

