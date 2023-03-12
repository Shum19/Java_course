package MyLibb;

import java.util.Scanner;
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
    }

