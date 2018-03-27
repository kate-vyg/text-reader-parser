package by.text.parser.model;

public class Paragraph {

    private String sentence;
    private String[] paragraph1;

    public Paragraph(String[] paragraph1) {
        this.paragraph1 = paragraph1;
        if (paragraph1 == null) {
            System.out.println("NullPointerException");
        }
        for (int i = 0; i < paragraph1.length; i ++) {
            String[] sentences = paragraph1[i].split("[.!?]");
            for (String sentence:sentences) {
                System.out.println(sentence);
            }
        }
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

}
