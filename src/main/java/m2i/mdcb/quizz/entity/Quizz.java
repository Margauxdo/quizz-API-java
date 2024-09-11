package m2i.mdcb.quizz.entity;

import java.util.ArrayList;
import java.util.List;

public class Quizz {
    private List<Question> questions = new ArrayList<>();
    private Category category;
    private int size;


    public Quizz() {
        this.size = 20;
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
