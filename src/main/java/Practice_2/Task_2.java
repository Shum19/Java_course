package Practice_2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

// сжать строку aaaabbbcdd -> a4b3cd2
public class Task_2 {
    public static void main(String[] args) {
        String text = "aaaabbbcdd";
        String compressed = compress(text);
        System.out.println(compressed);

    }

    public static String compress(String text){
        int count = 1;
        String compressed = "";
        char tmp = text.charAt(0);
        for (int i = 1; i < text.length(); i++){
            char c = text.charAt(i);
            if (tmp == c){
                count++;
            } else if (tmp != c){
                if (count == 1) compressed += tmp;
                else compressed += tmp + Integer.toString(count);
                tmp = c;
                count = 1;
            }
        }
        if (count == 1) compressed += tmp;
        else compressed += tmp + Integer.toString(count);
        return compressed;
    }
}
