package by.text.parser.model;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {

    private List<Sentence> sentences;

    public Paragraph(String paragraph) {
        String[] sentencesContents = paragraph.split("[/.!?]");
        List<Sentence> sentences = new ArrayList<>();
        for (String content : sentencesContents) {
            Sentence sentence = new Sentence(content);
            sentences.add(sentence);
        }
        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

}
