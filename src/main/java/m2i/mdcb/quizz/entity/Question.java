package m2i.mdcb.quizz.entity;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private int id;
    private String question;

    private List<Answer> answers = new ArrayList<Answer>();
    private Category category;

    public Question() {
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getGoodAnswer() {
        return goodAnswer;
    }

    public List<String> getBadAnswers() {
        return badAnswers;
    }

    public Category getCategory() {
        return category;
    }
}
