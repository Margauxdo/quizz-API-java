package m2i.mdcb.quizz.repository;

import m2i.mdcb.quizz.entity.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

}
