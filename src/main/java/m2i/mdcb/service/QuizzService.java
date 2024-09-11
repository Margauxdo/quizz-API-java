package m2i.mdcb.service;

import m2i.mdcb.entity.Answer;
import m2i.mdcb.entity.Category;
import m2i.mdcb.entity.Question;
import m2i.mdcb.entity.Quizz;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizzService {

    private final QuestionService questionService;

    public QuizzService(QuestionService questionService) {
        this.questionService = questionService;
    }

    public Quizz createQuizzByCategory(Integer idCategory) {
        List<Question> questions = questionService.getQuestionByRandom(idCategory);
        int size = 20;

        // TODO CATEGORY
        return new Quizz(questions, Category.HISTOIRE, size);
    }
}
