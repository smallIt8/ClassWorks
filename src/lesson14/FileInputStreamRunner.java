package src.lesson14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class FileInputStreamRunner {
    public static void main(String[] args) {

        File file = Path.of( "ClassWorks","src", "resources", "text.txt").toFile();
        File dir = Path.of( "ClassWorks","src", "resources").toFile();
        try (FileInputStream fileInputStream = new FileInputStream(file)){
            byte[] bytes = fileInputStream.readAllBytes();
            String text = new String(bytes);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("");

        try (FileInputStream fileInputStream2 = new FileInputStream(file)){
            byte[] bytes = new byte[fileInputStream2.available()];
            int count = 0;

            while (true){
                byte currentByte;
                if ((currentByte = (byte) fileInputStream2.read()) == -1){
                    String text2 = new String(bytes);
                    System.out.println(text2);
                    break;
                }
                    bytes[count++] = currentByte;
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}