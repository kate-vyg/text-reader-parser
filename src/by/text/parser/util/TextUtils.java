package by.text.parser.util;

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
            Files.write(filePath, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
