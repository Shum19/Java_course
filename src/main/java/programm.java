import MyLibb.MyLib;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

public class programm {
       static public void main(String[] args) throws IOException {

//           String text = "Урок 4. Хранение и обработка данных ч1: приоритетные коллекции";
//           String a = MyLib.Underline(text);
//           System.out.println(a);
           String sep = File.separator;
           Path path = Path.of("src",sep,  "main",  sep, "java", sep, "Home_Task_4", sep, "Home_Task4_1.java");
           Path fullPath = path.toAbsolutePath();
//           Files.createDirectory(fullPath);
           Files.createFile(fullPath);
           System.out.println(fullPath);


       }
   }

