import MyLibb.MyLib;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

public class programm {
       static public void main(String[] args) throws IOException {

//           String text = "Урок 2. Почему вы не можете не использовать API";
//           String a = MyLib.Underline(text);
//           System.out.println(a);
           String sep = File.separator;
           Path path = Path.of("src",sep,  "main",  sep, "java", sep, "Home_Task_3", sep, "Task_3_2.java");
           Path fullPath = path.toAbsolutePath();
           Files.createFile(fullPath);
           System.out.println(fullPath);


       }
   }

