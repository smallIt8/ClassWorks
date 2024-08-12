package src.lesson14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class OutputRunner {
    public static void main(String[] args) {
        File file = Path.of( "ClassWorks","src", "resources", "output.txt").toFile();
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            String hello = "Hello Word";
            fileOutputStream.write(hello.getBytes());
            fileOutputStream.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }
}