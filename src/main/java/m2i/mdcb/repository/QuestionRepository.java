package m2i.mdcb.repository;

import m2i.mdcb.entity.Question;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

    //    @Query("SELECT all FROM question as q ORDER BY random() LIMIT 20")
    @Query(value = "SELECT * FROM question WHERE question.category = ?1 ORDER BY random() LIMIT 20", nativeQuery = true)
    List<Question> findQuestionsByRandom(int idCategory);
}
