package by.text.parser;

import by.text.parser.util.TextUtils;

import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String text = TextUtils.readAsString(Paths.get("E:/java/prague.txt"));
        System.out.println(text);
    }

}
