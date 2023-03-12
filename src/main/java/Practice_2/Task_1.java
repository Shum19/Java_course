package Practice_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Task_1 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        String text = "My test";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }
}
