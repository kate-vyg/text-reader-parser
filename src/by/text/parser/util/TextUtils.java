package by.text.parser.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextUtils {

    public static String readAsString(Path filePath) {
        String content = null;
        try {
            content = new String(Files.readAllBytes(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void writeToFile(String content, Path filePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(filePath)));
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
