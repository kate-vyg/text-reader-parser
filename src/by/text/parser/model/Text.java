package by.text.parser.model;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Paragraph> paragraphs = new ArrayList<>();

    public Text(String text) {
        String[] paragraphsContents = text.split("[\\n]");
        for (String content : paragraphsContents) {
            paragraphs.add(new Paragraph(content));
        }
    }

    public String getAsString() {
        StringBuilder result = new StringBuilder("");
        for (Paragraph paragraph : paragraphs) {
            result.append(paragraph.getAsString()).append("\n");
        }
        return result.toString();
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

}
