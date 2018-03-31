package by.text.parser.model;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Paragraph> paragraphs;

    public Text(String text) {
        String[] par = text.split("[\\n]");
        List<Paragraph> paragraphs = new ArrayList<>();
        for (String content : par) {
            Paragraph paragraph = new Paragraph(content);
            paragraphs.add(paragraph);
        }
        this.paragraphs = paragraphs;
    }

    public String textConstructor(String paragraphs) {
        return String.join( "\n", paragraphs);
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

}
