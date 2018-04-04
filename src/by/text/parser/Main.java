package by.text.parser;

import by.text.parser.model.Text;
import by.text.parser.util.TextUtils;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String textStringContent = TextUtils.readAsString(Paths.get("E:/java/prague.txt"));
        Text text = new Text(textStringContent);
        String finalText = text.getAsString();
        TextUtils.writeToFile(finalText, Paths.get("E:/java/output.txt"));
    }
}
