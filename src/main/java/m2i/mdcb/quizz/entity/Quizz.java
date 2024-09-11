package m2i.mdcb.quizz.entity;

import java.util.List;

public class Quizz {
    private List<Question> questions;
    private Category category;
    private int size;


    public Quizz() {
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public Category getCategory() {
        return category;
    }

    public int getSize() {
        return size;
    }
}
