package by.text.parser.model;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {

    private List<Sentence> sentences = new ArrayList<>();

    public Paragraph(String paragraph) {
        String[] sentencesContents = paragraph.split("[/.!?]");
        for (String content : sentencesContents) {
            Sentence sentence = new Sentence(content);
            sentences.add(sentence);
        }
    }

    public String getAsString() {
        StringBuilder result = new StringBuilder("");
        for (Sentence sentence : sentences) {
            result.append(sentence.getContent()).append(".");

        }
        return result.toString();
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

}
