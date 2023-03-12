package Home_Task_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**2.  Создать файл с названием file.txt. Если файл уже есть, то создавать
        не надо Записать в него Слово "TEXT" 100 раз
 **/
public class Task_2_2 {
    public static void main(String[] args) throws IOException {
        String pathProj = System.getProperty("user.dir");
        String constDir = "/src/main/java/";
        String fullPathStr = pathProj + constDir + "Home_Task_2/file_test.txt";
        Path fullPath = Paths.get(fullPathStr);
        if (!Files.exists(fullPath)) Files.createFile(fullPath);
        else {
            FileOutputStream fileTest = new FileOutputStream(fullPathStr);
            byte[] text = " TEXT".getBytes();
            byte[] sep = "\n".getBytes();
            for (int i = 1; i <= 100; i++){
                byte [] nums = Integer.toString(i).getBytes();
                fileTest.write(nums);
                fileTest.write(text);
                fileTest.write(sep);
            }
            System.out.println();
        }


    }
}
