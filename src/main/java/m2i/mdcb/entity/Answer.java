package m2i.mdcb.entity;

import jakarta.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private int id;
    private String answer;
    private boolean correct;

    public Answer() {
    }

    public Answer(String answer, boolean correct) {
        this.answer = answer;
        this.correct = correct;
    }

    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return correct;
    }
}
