package m2i.mdcb.entity;

import java.util.ArrayList;
import java.util.List;

public class Quizz {

    private List<Question> questions = new ArrayList<>();
    private Category category;
    private int size;

    public Quizz() {
        this.size = 20;
    }

    public Quizz(List<Question> questions, Category category, int size) {
        this.questions = questions;
        this.category = category;
        this.size = size;
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
