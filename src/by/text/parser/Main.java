package by.text.parser;

import by.text.parser.util.TextReader;

public class Main {

    public static void main(String[] args) {
        String text = TextReader.readAsString("E:/java/prague.txt");
        System.out.println(text);
    }

}
