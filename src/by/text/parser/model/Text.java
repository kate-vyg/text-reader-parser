package by.text.parser.model;

public class Text {

    private String text;
    private String paragraph;
    private String [] paragraphs;

    public Text(String text) {
        this.text = text;
        paragraphs = text.split("[\\r\\n]+");
        for (String paragraph:paragraphs) {
            System.out.println(paragraph);
        }
    }

    public String[] getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(String[] paragraphs) {
        this.paragraphs = paragraphs;
    }
}
