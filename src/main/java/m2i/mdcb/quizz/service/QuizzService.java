package m2i.mdcb.quizz.service;

import m2i.mdcb.quizz.entity.Quizz;
import m2i.mdcb.quizz.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuizzService {

    private final QuestionService questionService;
    public QuizzService(QuestionService questionService) {
        this.questionService = questionService;
    }
    public Quizz create() {
        return questionService.save(quizz);
    }




}
