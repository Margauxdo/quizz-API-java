package m2i.mdcb.service;

import m2i.mdcb.entity.Question;
import m2i.mdcb.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestionByRandom(Integer idCategory) {
        return questionRepository.findQuestionsByRandom(idCategory);
    }
}
