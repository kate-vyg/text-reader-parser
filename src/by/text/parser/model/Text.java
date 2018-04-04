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

    public String getText() {
        String text = "";
            for (Paragraph par : paragraphs) {
                String paragraph = par.getPar();
                text = String.join("\n", paragraph);
            }
        return text;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

}
